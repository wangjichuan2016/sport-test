package com.lesports.wangjichuan.util.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.data.Stat;

public class ZookeeperTest {
	public static String PATH = "/data/crud";
	public static void main(String[] args) {
		CuratorFramework client = CuratorFrameworkFactory.builder()
				.connectString("")
				.sessionTimeoutMs(30000).connectionTimeoutMs(30000)
				.canBeReadOnly(false).retryPolicy(new ExponentialBackoffRetry(1000, Integer.MAX_VALUE))
				.defaultData(null).build();
		client.start();
		try{
			client.create().forPath(PATH,"i miss you".getBytes());
			
			byte[] bs = client.getData().forPath(PATH);  
            System.out.println("新建的节点，data为:" + new String(bs));
            
            Stat stat = client.checkExists().forPath(PATH);  
            System.out.println(stat);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
