package com.lesports.wangjichuan.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import java.util.ArrayList;

/**
 * Created by wangjichuan on 16-4-15.
 */
public class SystemWebSocketHander implements WebSocketHandler{
    private static final Logger log = LoggerFactory.getLogger(SystemWebSocketHander.class);
    private static final ArrayList<WebSocketSession> users = new ArrayList<WebSocketSession>();
//    private WebSocketServic
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        log.info("connect to the websocket success......");
        users.add(session);
        String userName = (String)session.getAttributes().get("username");
        if(userName != null){
//            int count =
        }
    }

    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> webSocketMessage) throws Exception {

    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable throwable) throws Exception {
        log.info("websocket connection closed.......");
        users.remove(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        log.info("websocket connection closed.......");
        users.remove(session);
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
