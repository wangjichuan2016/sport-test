package com.lesports.wangjichuan.util.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogbackTest {
	public static final Logger log = LoggerFactory.getLogger(LogbackTest.class);
	public static final Logger monitorLog = LoggerFactory.getLogger("monitor");
	public static void main(String[] args) {
		log.debug("debug++++++");
		log.info("info++++++");
		log.warn("warn+++++");
		log.error("error++++");
		monitorLog.info("monitor+++++");
		print();
	}
	public static void print(){
		log.debug("hello+++++");
	}

}
