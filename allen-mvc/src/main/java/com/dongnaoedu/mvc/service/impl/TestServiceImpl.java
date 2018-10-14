package com.dongnaoedu.mvc.service.impl;

import java.util.Map;

import com.dongnaoedu.mvc.annotation.MyService;
import com.dongnaoedu.mvc.service.TestService;

@MyService("testService")
public class TestServiceImpl implements TestService {
	@Override
	public int insert(Map map) {
		System.out.println("MyServiceImpl:" + "insert");
		return 0;
	}

	@Override
	public int delete(Map map) {
		System.out.println("MyServiceImpl:" + "delete");
		return 0;
	}

	@Override
	public int update(Map map) {
		System.out.println("MyServiceImpl:" + "update");
		return 0;
	}

	@Override
	public int select(Map map) {
		System.out.println("MyServiceImpl:" + "select");
		return 0;
	}
}