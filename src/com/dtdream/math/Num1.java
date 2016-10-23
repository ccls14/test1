package com.dtdream.math;

public class Num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num=new int[10];
for (int i=0;i<num.length;i++){
	int a=(int)(Math.random()*100);
	num[i]=a;
	
}
for(int nu:num){
	System.out.println(nu);
}
	}

}
