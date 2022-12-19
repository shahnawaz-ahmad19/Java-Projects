package com.shaan.springcore;

public class A {
	B b; // DI(dependency injection)
	
	
	
	
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public void m()
	{
		System.out.println("mmmmmmmmmmmm");
	}
	
	private String add;

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

}
