package org.darion.yaphet.queue;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.queue.SimpleDistributedQueue;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class SimpleDistributedQueueExample {
	public static void main(String[] args) throws Exception {
		ExponentialBackoffRetry retryPolicy = new ExponentialBackoffRetry(1000,
				3);

		CuratorFramework client = CuratorFrameworkFactory.newClient(
				"127.0.0.1:2181", retryPolicy);

		SimpleDistributedQueue queue = new SimpleDistributedQueue(client,
				"/simple-queue");
		queue.offer("message".getBytes());
		System.out.println(new String(queue.take()));
	}
}
