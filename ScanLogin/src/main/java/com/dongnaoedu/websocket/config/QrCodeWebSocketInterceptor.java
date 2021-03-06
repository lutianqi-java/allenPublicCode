package com.dongnaoedu.websocket.config;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

@Component
public class QrCodeWebSocketInterceptor implements HandshakeInterceptor {

	// 进入hander之前的拦截
	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse serverHttpResponse,
			WebSocketHandler webSocketHandler, Map<String, Object> map) throws Exception {
		if (request instanceof ServletServerHttpRequest) {
			String ID = request.getURI().toString().split("uuid=")[1];
			System.out.println("当前session的ID=" + ID);
			// 把数据压入map，可以在Handler中直接拿到
			map.put("WEBSOCKET_USERID", ID);
		}
		return true;
	}

	@Override
	public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse,
			WebSocketHandler webSocketHandler, Exception e) {
		System.out.println("进入webSocket的afterHandshake拦截器！");
	}

}
