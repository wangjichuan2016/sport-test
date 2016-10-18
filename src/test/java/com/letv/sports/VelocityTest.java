package com.letv.sports;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.junit.Test;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wangjichuan on 16/10/18.
 */
public class VelocityTest {
    @Test
    public void test01(){
        VelocityEngine ve = new VelocityEngine();
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER,"class");
        ve.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        ve.init();
        Template t = ve.getTemplate("hello.vm");
        VelocityContext ctx = new VelocityContext();
        ctx.put("name","velocity");
        ctx.put("date",new Date());
        List temp = new ArrayList();
        temp.add("1");
        temp.add(2);
        ctx.put("list",temp);
        StringWriter sw = new StringWriter();
        t.merge(ctx,sw);
        print(sw.toString());

    }
    public <T> void print(T t){
        System.out.println(t);
    }
}
