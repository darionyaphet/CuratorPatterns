package org.darion.yaphet.basic;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.test.TestingServer;

public class BasicExamples {

	public static void main(String[] args) throws Exception {
		TestingServer server = new TestingServer();

		// Curator connection instances are allocated from
		// CuratorFrameworkFactory.
		// Only need one CuratorFramework object for each ZooKeeper cluster
		RetryPolicy policy = new ExponentialBackoffRetry(1000, 3);
		CuratorFramework client = CuratorFrameworkFactory.newClient(
				server.getConnectString(), policy);
		client.start();

		if (client.isStarted()) {

		}
		

		final String path = "/darion/node";

		client.create().forPath(path, "val".getBytes());
		byte[] val = client.getData().forPath(path);
		System.out.println(new String(val));
		client.delete().forPath(path);
		client.close();
	}
}
