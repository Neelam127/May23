package com.cg1;



public class thisKeyword {
	
	int a;
	
	public thisKeyword() {
		System.out.println("Calling default construct");
	}
	
	public thisKeyword(int a ) {
		this();
		this.a=a;
		System.out.println("Calling parameterised constructor"+a);
	}
	
	void m() {
		System.out.println("Method m is called");
	}
	
	void n() {
		System.out.println("Method n is called");
		
		this.m();
	}
	
	public static void main(String[] args) {
		
		thisKeyword th=new thisKeyword(10);
		
		th.n();
		
		
	}

}
