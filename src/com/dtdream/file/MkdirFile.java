package com.dtdream.file;

import java.io.File;

public class MkdirFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file =new File("e:\\w\\wu\\w");
if((file.getParentFile().getParentFile()).mkdir()){
	file.mkdirs();
}
else{
	System.out.println((file.getParentFile()).getParentFile()+" is cunz");
	if(file.getParentFile().mkdir()){
		file.getParentFile().mkdir();
	}
	else{
		file.mkdir();
		
	}
}

System.out.println(file.getParentFile());
System.out.println((file.getParentFile()).getParentFile());
System.out.println(((file.getParentFile()).getParentFile()).mkdir());
	}

}
