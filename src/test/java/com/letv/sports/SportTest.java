package com.letv.sports;

import com.google.common.base.Preconditions;
import com.lesports.wangjichuan.po.Category;
import com.mongodb.util.JSON;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.io.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.*;

/**
 * Created by wangjichuan on 16-3-17.
 */
public class SportTest {
    @Test
    public void testArray(){
        long start = System.currentTimeMillis();
        List<Integer> a1 = new ArrayList<Integer>();
        for(int i=0;i<1000000;i++){
            a1.add(i);
        }

        List<Integer> tmp = new ArrayList<Integer>();
/*        for(Integer a : a1){
            tmp.add(a);
        }*/
        tmp.addAll(a1);
        long end = System.currentTimeMillis();
        System.out.println("耗时为："+(end-start)+"ms");
    }

    @Test
    public void testProperties(){
       try{
           Properties properties = new Properties();
           File a = new File("1.properties");
           properties.load(new BufferedInputStream(new FileInputStream(a)));
           properties.setProperty("name","wangjichuan");
           properties.store(new BufferedOutputStream(new FileOutputStream("2.properties")),"user name");
       }catch (Exception e){
           e.printStackTrace();
       }
    }
    @Test
    public void testClass(){

        Class clazz = Category.class;

        Class superClazz = clazz.getSuperclass();
    }
    private static final char HEX_DIGITS[] = "0123456789abcdef".toCharArray();
    private static final String REQUEST_CHARSET = "UTF-8";
    @Test
    public void mu5Test() throws Exception{
        MessageDigest digest = MessageDigest.getInstance("MD5");
        digest.update("a".getBytes(REQUEST_CHARSET));
        print(toHexString(digest.digest()));
    }
    private static String toHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            sb.append(HEX_DIGITS[(b & 0xf0) >>> 4]);
            sb.append(HEX_DIGITS[b & 0x0f]);
        }
        return sb.toString();
    }
    @Test
    public void testGuava(){
       try {
           String name = null;
           int age = 10;
//        Preconditions.checkNotNull(name,"参数不能为空,请核对再来");
           Enumeration<NetworkInterface> interfaceEnumeration = NetworkInterface.getNetworkInterfaces();
           while (interfaceEnumeration.hasMoreElements()){
               NetworkInterface networkInterface = interfaceEnumeration.nextElement();
               if(true){
                   print(networkInterface.getName());
                   Enumeration addresses = networkInterface.getInetAddresses();
                   InetAddress address = null;
                   while (addresses.hasMoreElements()) {
                       address = (InetAddress) addresses.nextElement();
                       if (address != null && address instanceof Inet4Address) {
                          print(address.getHostAddress());
                       }
                   }
               }
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    @Test
    public void testMap(){
        Map<Integer,String> data = new HashMap<Integer,String>();
        data.put(2,"222222");
        data.put(1,"111111");
        data.put(3,"333333");
        print("普通hashMap:");
        print(JSON.serialize(data));
        print("LinkedMap:");
        Map<Integer,String> data1 = new LinkedHashMap<Integer, String>();
        data1.put(2,"222222");
        data1.put(1,"111111");
        data1.put(3,"333333");
        print(JSON.serialize(data1));
    }

    public <T> void  print(T t){
        System.out.println(t);
    }


}
