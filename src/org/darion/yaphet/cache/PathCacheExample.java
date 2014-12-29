package org.darion.yaphet.cache;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheEvent;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheListener;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheMode;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class PathCacheExample {
	private static final String PATH = "/example/nodeCache";

	public static void main(String[] args) throws Exception {

		CuratorFramework client = CuratorFrameworkFactory.newClient(
				"127.0.0.1:2181", new ExponentialBackoffRetry(1000, 3));

		PathChildrenCache cache = new PathChildrenCache(client, PATH,
				PathChildrenCacheMode.CACHE_DATA);
		cache.start();

		PathChildrenCacheListener listener = new PathChildrenCacheListener() {

			@Override
			public void childEvent(CuratorFramework client,
					PathChildrenCacheEvent event) throws Exception {
				
			}
		};

		cache.close();
	}
}
