package com.dtdream.file;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file=new File("E:\\wujing.txt");
if(!file.exists()){
	try{
		file.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}
}
else {
	System.out.println("wenjyicunz");
}

	}

		
	
}
