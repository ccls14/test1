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


System.out.printf("�����ͱ����ĵ�ֵΪ " +
        "%f, ���ͱ�����ֵΪ " +
        " %d, �ַ���������ֵΪ " +
        "is %s", floatVar, intVar, stringVar+"\n");
	

	

	fs = String.format("�����ͱ����ĵ�ֵΪ " +
	                   "%f, ���ͱ�����ֵΪ " +
	                   " %d, �ַ���������ֵΪ " +
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
