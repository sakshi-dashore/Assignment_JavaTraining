package com.sd;

public class Simplebean implements Inital,DisposableBean {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy simple");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("check intial simple");
	}

	public Simplebean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
