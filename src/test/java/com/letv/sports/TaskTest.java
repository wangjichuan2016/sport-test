package com.letv.sports;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;




public class TaskTest {
	@Test
	public void test01() throws Exception{
		ExecutorService executor = Executors.newCachedThreadPool();
		CompletionService<Integer> task = new ExecutorCompletionService<Integer>(executor);
		task.submit(new CountTask(200));
		task.submit(new CountTask(20));
		for(int i= 0;i<2;i++){
			Future<Integer> future = task.take();
			System.out.println(future.get());
		}
		
	}

}
class CountTask<Integer> implements Callable<Integer>{
	private Integer countNum ;

	public Integer call() throws Exception {
		Long time =0l;
		Thread.currentThread().sleep(1000);
		System.out.println("循环的次数为："+countNum);
		return countNum;
	}
	public CountTask(Integer count){
		this.countNum = count;
	}
	public Integer getCountNum() {
		return countNum;
	}
	public void setCountNum(Integer countNum) {
		this.countNum = countNum;
	}
	
	
}
