package com.dtdream;

public class Dog1 extends Dog {

	@Override
	public int setage1(int i) {
		// TODO Auto-generated method stub
		return i;
	
	}
	public void setage(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog1 dog1=new Dog1();
dog1.setage(12);
//Dog dog=new Dog();
System.out.println(dog1.setage1(34));
	}

}
