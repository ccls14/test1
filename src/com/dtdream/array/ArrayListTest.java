package com.dtdream.array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<String>();
list.add("a");
list.add("b");
list.add("c");
System.out.println(list);
ArrayList<String> list2 = new ArrayList<String>();
list2.add("a");
list2.add("b");
list2.add("c");
System.out.println(list2);
list.addAll(list2);
System.out.println(list);
list.remove(2);
System.out.println(list);
list.remove("c");
System.out.println(list);
list.clear();
System.out.println(list);
list2.set(2, "we");
System.out.println(list2);
	}

}
