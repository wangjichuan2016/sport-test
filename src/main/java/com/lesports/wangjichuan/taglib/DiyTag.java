package com.lesports.wangjichuan.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Created by wangjichuan on 16-10-18.
 */
public class DiyTag extends TagSupport{
    private String name;
    private int age;
    @Override
    public int doStartTag() throws JspException {
        return super.EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        JspWriter out = pageContext.getOut();
        String content = "您的名字是："+name+",您的年龄是："+age+"<br/>";
        System.out.println(content);
       try {
           out.write(content);
       }catch (Exception e){
           e.printStackTrace();
       }
        return super.EVAL_PAGE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
