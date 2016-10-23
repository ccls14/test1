package com.dtdream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelePhone phone = new TelePhone();
		SmartPhone smartphone = new SmartPhone();
		CellPhone cellphone = new CellPhone();
		TelePhone phone1 = new SmartPhone();
	//	CellPhone cell1 = new TelePhone();
		System.out.println(smartphone instanceof SmartPhone);
		System.out.println(phone instanceof SmartPhone);
		System.out.println(phone instanceof SmartPhone);
		System.out.println(smartphone instanceof TelePhone);
		smartphone.call();
		cellphone.call();
		phone1.call();
		TelePhone phone2 = new CellPhone();
		phone2.send();
		//SmartPhone phone3 =(SmartPhone)phone2;
		//phone3.send();
		
		

	}

}
