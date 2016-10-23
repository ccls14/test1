package com.dtdream.encapsulation;

import com.dtdream.TelePhone;



public class Texi {
	public static void main(String args[]){
		Car car = new Car();
		TelePhone phone = new TelePhone();
		phone.call();
		car.big=12;
	//	car.age=12;
		//car.big1();
		car.setAge(12);
		int age3=car.getAge();
		System.out.println(age3);
	}
}
