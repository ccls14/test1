package com.dtdream.file;

import java.io.File;

public class MkdirFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file =new File("e:\\w\\wu\\w");
if(file.mkdirs()){
if(file.getParentFile().mkdir()){
	System.out.println("fumulbucunzicunz zhijiechuangj");
	file.mkdirs();
}
else{
	file.mkdir();
	System.out.println("yicunz");

}

System.out.println(file.getParentFile().mkdir());

	}
else{
	System.out.println("yicunzss");
	}

	}

}
