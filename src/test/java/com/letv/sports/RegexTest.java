package com.letv.sports;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wangjichuan on 16-10-14.
 */
public class RegexTest {
    public static void main(String[] args){
        Pattern p = Pattern.compile("(Kel)vin");
        Matcher m = p.matcher("aaa Kelvin Li and Kelvin Chan are both working in Kelvin Chen's KelvinSoftShop company");
        StringBuffer sb = new StringBuffer();
        int i=0;
        boolean result = m.find();
        print(m.group()+"-------"+m.groupCount()+"----------"+m.group(1));
        while(result) {
            i++;
            print(result);
            m.appendReplacement(sb, "Kevin");
            System.out.println("第"+i+"次匹配后sb的内容是："+sb);
            //继续查找下一个匹配对象
            result = m.find();
        }
    }
    public  static <T> void print(T t){
        System.out.println(t);
    }
}
