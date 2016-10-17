package com.lesports.wangjichuan.util.guava;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;

public class GuavaTest {
	public static  Logger log = LoggerFactory.getLogger(GuavaTest.class);
	public static void main(String[] args) throws IOException{
		ImmutableSet<String> imSet=ImmutableSet.of("peida","jerry","harry","lisa");
		imSet.add("22");
	}
	public static <T> void print(T t){
		System.out.println(t.toString());
	}

}
