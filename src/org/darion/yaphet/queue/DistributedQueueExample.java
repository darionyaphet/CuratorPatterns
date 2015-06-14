package org.darion.yaphet.queue;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.api.CuratorEvent;
import org.apache.curator.framework.api.CuratorListener;
import org.apache.curator.framework.recipes.queue.DistributedIdQueue;
import org.apache.curator.framework.recipes.queue.DistributedQueue;
import org.apache.curator.framework.recipes.queue.QueueBuilder;
import org.apache.curator.framework.recipes.queue.QueueConsumer;
import org.apache.curator.framework.recipes.queue.QueueSerializer;
import org.apache.curator.framework.state.ConnectionState;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.test.TestingServer;

public class DistributedQueueExample {
	private static final String PATH = "/example/queue";

	public static void main(String[] args) throws Exception {

		ExponentialBackoffRetry retryPolicy = new ExponentialBackoffRetry(1000,
				3);
		CuratorFramework client = CuratorFrameworkFactory.newClient(
				"127.0.0.1:2181", retryPolicy);

		client.getCuratorListenable().addListener(new CuratorListener() {
			@Override
			public void eventReceived(CuratorFramework client,
					CuratorEvent event) throws Exception {
				System.out.println("Event : " + event.getType().name());
			}
		});

		client.start();

		/**
		 * Create ZooKeeper Distributed Queue
		 */

		//
		QueueConsumer<String> consumer = new QueueConsumer<String>() {
			@Override
			public void stateChanged(CuratorFramework client,
					ConnectionState newState) {
				System.out.println("Connection new state: " + newState.name());
			}

			@Override
			public void consumeMessage(String message) throws Exception {
				System.out.println("Consume one message: " + message);
			}
		};

		//
		QueueSerializer<String> serializer = new QueueSerializer<String>() {
			@Override
			public byte[] serialize(String item) {
				return item.getBytes();
			}

			@Override
			public String deserialize(byte[] bytes) {
				return new String(bytes);
			}
		};

		QueueBuilder<String> builder = QueueBuilder.builder(client, consumer,
				serializer, PATH);
		DistributedIdQueue<String> queue = builder.buildIdQueue();
		queue.start();

		TestingServer server = new TestingServer();
	}
}
