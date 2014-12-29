package org.darion.yaphet.basic;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class BasicExamples {

	public static void main(String[] args) throws Exception {

		// Curator connection instances are allocated from
		// CuratorFrameworkFactory.
		// Only need one CuratorFramework object for each ZooKeeper cluster
		RetryPolicy policy = new ExponentialBackoffRetry(1000, 3);
		CuratorFramework client = CuratorFrameworkFactory.newClient(
				"127.0.0.1:2181", policy);
		client.start();

		final String path = "/darion/node";

		client.create().forPath(path, "val".getBytes());
		// client.checkExists().forPath(path);
		byte[] val = client.getData().forPath(path);
		System.out.println("Path : " + path + " --> " + new String(val));
		client.delete().forPath(path);
		client.close();
	}
}
