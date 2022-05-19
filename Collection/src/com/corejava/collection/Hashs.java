package com.corejava.collection;

import java.util.HashSet;

public class Hashs {
public static void main(String[] args) {
	HashSet<String>hashSet=new HashSet<String>();
	hashSet.add("Prathamesh");
	hashSet.add("Prutha");
	hashSet.add("Siya");
	hashSet.add("Prutha");
	hashSet.add("Prathamesh");
//	for(String i:hashSet)
//	{
//		System.out.println(i);
//	}
	System.out.println(hashSet);
}
}
