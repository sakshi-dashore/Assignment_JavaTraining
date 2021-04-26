package com.sd;

public class MyBean implements DisposableBean{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method");
	}

}
