package com.lesports.wangjichuan.util.zookeeper;

import java.util.List;
import java.util.concurrent.DelayQueue;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.utils.CloseableUtils;

import com.google.common.collect.Lists;

public class LeaderSelectorExample {
	public static void main(String[] args) {
		List<CuratorFramework> clients = Lists.newArrayList();
		List<LeaderSelectorClient> examples = Lists.newArrayList();
		try{
			for(int i=0;i<10;i++){
				CuratorFramework client = CuratorFrameworkFactory.newClient("",null);
				
			}
		}catch(Exception e){
			
		}
//		CloseableUtils.closeQuietly(arg0);
//		DelayQueue<Delayed>
	}

}
