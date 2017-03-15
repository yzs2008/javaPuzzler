package com.zzu.kaidi.java.puzzles.puzzlers.puzzle8;

public class NotInitializeClass {

	public static void main(String[] args){
//		System.out.println(SubClass.value);
		SubClass sc=new SubClass();
		System.out.println(sc.value);
		SuperClass[] sca=new SubClass[10];
//		System.out.println(SubClass.value);
	}
}
