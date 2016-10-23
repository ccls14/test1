package com.dtdream.string;

public class ToString {
	public static void main(String[] args) {
		double m=12.4;
		String str1=Double.toString(m);
		String str2=String.valueOf(m);
		String str3=m+"";
		System.out.println(str1+" "+str2+" "+str3);
	}

}
