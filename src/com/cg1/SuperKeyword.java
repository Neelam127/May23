package com.cg1;

class Animal{
	String color="White";
	
	public Animal() {
		System.out.println("animal constructor");
	}
	
	void Animal() {
		System.out.println("animal method");
	}
}

class Dog extends Animal{
String color="Black";
	
	public Dog() {
		super();
		System.out.println("Dog constructor");
	}
	
	void Animal() {
		System.out.println("animal method");
		super.Animal();
		System.out.println(super.color);
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.Animal();
		
	}

}
