package org.darion.yaphet.queue;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.queue.QueueBuilder;
import org.apache.curator.framework.recipes.queue.QueueConsumer;
import org.apache.curator.framework.recipes.queue.QueueSerializer;
import org.apache.curator.framework.state.ConnectionState;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class Publisher {

	private static class Consumer implements QueueConsumer<String> {

		@Override
		public void stateChanged(CuratorFramework client,
				ConnectionState newState) {

		}

		@Override
		public void consumeMessage(String message) throws Exception {

		}
	}

	private static class QSerializer implements QueueSerializer<String> {

		@Override
		public byte[] serialize(String item) {
			return null;
		}

		@Override
		public String deserialize(byte[] bytes) {
			return null;
		}
	}

	public static void main(String[] args) {
		CuratorFramework client = CuratorFrameworkFactory.newClient(
				"127.0.0.1:2181", new ExponentialBackoffRetry(1000, 3));
		QueueBuilder<String> builder = QueueBuilder.builder(client,
				new Consumer(), new QSerializer(), "/transfer");
	}
}
