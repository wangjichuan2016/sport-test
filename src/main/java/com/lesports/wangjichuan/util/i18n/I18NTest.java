package com.lesports.wangjichuan.util.i18n;


import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by wangjichuan on 16-3-28.
 */
public class I18NTest{
    public static void main(String[] args){
        Locale locale = new Locale("zh","CN");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("msg",locale);
        print(resourceBundle.getString("aaa"));
        Locale locale1 = new Locale("en","US");
        ResourceBundle resb2 = ResourceBundle.getBundle("msg", locale1);
        print(resb2.getString("aaa"));
    }
    public  static <T> void print(T t){
        System.out.println(t);
    }
}
