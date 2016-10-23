package com.dtdream.abstracttest;

public class Fly1 extends Fly {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("fly1 is flying");

	}
	public static void main(String args[]){
		Fly1 fly1 = new Fly1();
		fly1.run();
	//	Fly fly = new Fly("sdsd");
		String name="we";
		System.out.println(name);
	}
}
