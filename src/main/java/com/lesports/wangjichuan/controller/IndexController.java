package com.lesports.wangjichuan.controller;

import com.alibaba.fastjson.JSONObject;
import com.lesports.wangjichuan.dao.CategoryDao;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by wangjichuan on 16-6-29.
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private CategoryDao studentDao;
    @ResponseBody
    @RequestMapping("hello/{name}")
    public Object hello(@PathVariable("name") String name,HttpServletRequest request,HttpServletResponse response){
        System.out.println("hello world!!!");
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("name",name);
        data.put("name",name);
        data.put("age",25);
        String callBack = request.getParameter("callback");
        response.setContentType("application/javascript;charset=utf-8");
        return callBack+"("+ JSONObject.toJSONString(data)+")";
//        return data;
    }
    @RequestMapping(value = "login")
    public ModelAndView login(HttpServletRequest request,HttpServletResponse response,ModelAndView modelAndView){
        String id = request.getParameter("id");
        modelAndView.addObject("name",id);
        modelAndView.setViewName("login");
//       List<Category> category = studentDao.get(Integer.parseInt(id),"哈哈");
        return modelAndView;
    }
    @RequestMapping("fileUpload")
    public void fileUpload(HttpServletRequest request,HttpServletResponse response,ModelAndView modelAndView) throws Exception{
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setSizeThreshold(10);
        ServletContext servletContext = request.getServletContext();
        File repository = (File)servletContext.getAttribute("javax.servlet.context.tempdir");
        factory.setRepository(repository);
        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setSizeMax(1);
        ProgressListener progressListener = new ProgressListener() {
            @Override
            public void update(long pBytesRead, long pContentLength, int pItems) {
                System.out.println("we are currently reading item "+pItems);
                if(pContentLength == -1){
                    System.out.println("So far, " + pBytesRead + " bytes have been read.");
                }else {
                    System.out.println("So far, " + pBytesRead + " of " + pContentLength
                            + " bytes have been read.");
                }
            }
        };
        upload.setProgressListener(progressListener);
        List<FileItem> items = upload.parseRequest(request);
        Iterator<FileItem> iter = items.iterator();
        while (iter.hasNext()){
            FileItem item = iter.next();
            if(item.isFormField()){
                String name = item.getFieldName();
                String value = item.getString();
                String fileName = item.getName();
                String contentType = item.getContentType();
                boolean isInMemory = item.isInMemory();
                File uploadFile = new File("d:/tmp/111.jpg");
                item.write(uploadFile);
            }else {

            }
        }
        try{
            response.getWriter().write("isMultipart="+isMultipart);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Map<String,String> data = new HashMap<String, String>();
        System.out.println(data.get("wo"));
    }
}
