package com.lesports.wangjichuan.util.couchbase;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.utils.AddrUtil;

public class CouchbaseTest {
	public static void main(String[] args) throws Exception{
		MemcachedClientBuilder builder = new XMemcachedClientBuilder(AddrUtil.getAddresses ("10.11.144.220:11211"));
		MemcachedClient memcachedClient = builder.build();
		for(int i=0;i<100010000;i++){
			memcachedClient.set("hello", 0, "hello World"+i);
		}
	
		memcachedClient.shutdown();
		
	}

}
