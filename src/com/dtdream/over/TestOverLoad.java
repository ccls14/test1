package com.dtdream.over;

public class TestOverLoad {
 static TestOverLoad over = new TestOverLoad();
	static int high=1;
	int sum=0;
	public static void age(){
		System.out.println("age");
	}
	public void age(int i){
		System.out.println("age"+i);
	}
	public int age(int i ,int j){

		return sum=i+j;
	}
	public static void main(String[] args){
		TestOverLoad over1 = new TestOverLoad();
		over1.age();
		TestOverLoad.age();
		TestOverLoad.age();
		over1.age(2);
		int p=TestOverLoad.high;
		int k =over1.high;
		over.age();
		System.out.println("sum:"+over1.age(1,2));
	}
	
}
