package com.lesports.wangjichuan.util.server;

import com.lesports.wangjichuan.util.CommonTest;
import com.lesports.wangjichuan.util.handler.HelloWorld;
import org.eclipse.jetty.server.Server;

/**
 * Created by wangjichuan on 16-3-16.
 */
public class JettyHttpServer extends CommonTest{
    public static void main(String[] args) throws Exception{
        Server server = new Server(8080);
        server.setHandler(new HelloWorld());
        server.start();
        server.join();
    }
}
