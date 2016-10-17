package com.lesports.wangjichuan.util.code;

import com.lesports.wangjichuan.util.CommonTest;
import com.luhuiguo.chinese.ChineseUtils;

import java.io.*;

/**
 * Created by wangjichuan on 16-4-11.
 */
public class CodeTest extends CommonTest{
    public static void main(String[] args) throws Exception{
        /*Runtime runtime = Runtime.getRuntime();
        String src = "恭喜发财";
        String newStr = ChineseUtils.toTraditional(src);
        print(newStr);
        print(src);
        File f1 = new File("1.properties");
        File f2 = new File("2.properties");
        if(!f1.exists()){
            f1.createNewFile();
        }
        if(!f2.exists()){
            f2.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f1));
        bufferedWriter.write(src);
        bufferedWriter.flush();
        Process process = runtime.exec("native2ascii 1.properties");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String content = null;
        while ((content = bufferedReader.readLine()) != null){
            print(content);
        }*/
//        print(toUnicode(src));

        System.getProperties().list(System.out);
    }

}
