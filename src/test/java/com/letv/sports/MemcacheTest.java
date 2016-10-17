package com.letv.sports;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.utils.AddrUtil;

public class MemcacheTest {
	public static void main(String[] args) throws Exception{
		MemcachedClientBuilder builder = 
				new XMemcachedClientBuilder(AddrUtil.getAddresses("localhost:11211"));
		MemcachedClient client = builder.build();
		client.set("hello", 0, "hello memcache");
		String value = client.get("hello");
		System.out.println(value);
		client.shutdown();
	}

}
