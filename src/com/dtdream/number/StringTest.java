package com.dtdream.number;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="sdsd.sdsd,sdsd.sd";
double floatVar=12.3;
int intVar =12;
String fs;
String stringVar="sdfdf";
System.out.println(a);
System.out.println(a.length());


System.out.printf("浮点型变量的的值为 " +
        "%f, 整型变量的值为 " +
        " %d, 字符串变量的值为 " +
        "is %s", floatVar, intVar, stringVar+"\n");
	

	

	fs = String.format("浮点型变量的的值为 " +
	                   "%f, 整型变量的值为 " +
	                   " %d, 字符串变量的值为 " +
	                   " %s", floatVar, intVar, stringVar);
	System.out.println(fs);
	
	
	 StringBuffer sBuffer = new StringBuffer(" test");
	 sBuffer.append("sdsd");
	 System.out.println(sBuffer);
	 sBuffer.reverse();
	 System.out.println(sBuffer);
	 System.out.println(sBuffer.length());
	}	

	
}
