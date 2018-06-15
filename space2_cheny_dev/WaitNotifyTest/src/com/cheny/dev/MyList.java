package com.cheny.dev;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private static List mylist = new ArrayList();
	
	public static void add() {
		mylist.add("anyString");
	}
	
	public static int size() {
		return  mylist.size();
	}
}
