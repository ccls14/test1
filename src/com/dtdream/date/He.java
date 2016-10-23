package com.dtdream.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class He {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar c=Calendar.getInstance();
System.out.println(c.get(Calendar.YEAR));
System.out.println(c.get(Calendar.MONTH));
System.out.println(c.get(Calendar.DATE));
Date date = c.getTime();
System.out.println(date);
SimpleDateFormat now =new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
System.out.println(now.format(date));
Long time = c.getTimeInMillis();
System.out.println(time);
	}

}
