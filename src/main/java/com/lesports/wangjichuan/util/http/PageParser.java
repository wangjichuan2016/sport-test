package com.lesports.wangjichuan.util.http;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class PageParser {
	public static void main(String[] args) throws Exception{
		Document doc = Jsoup.connect("http://linux.linuxidc.com/").get();
		String title = doc.title();
	}

}
