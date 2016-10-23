package com.dtdream.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Hello {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
Date d = new Date();
System.out.println(d);

SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
System.out.println(sdf2.format(d));
System.out.println(sdf1.format(d));
System.out.println(sdf3.format(d));
String str="2014-6-1 21:05:36";
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
Date date=sdf.parse(str);
System.out.println(date);
System.out.println(sdf3.format(date));
	}

}
