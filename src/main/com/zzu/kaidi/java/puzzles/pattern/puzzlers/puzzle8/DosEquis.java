package com.zzu.kaidi.java.puzzles.pattern.puzzlers.puzzle8;

public class DosEquis {
	public static void main(String[] args){
		char x='X';
		int i=0;
		System.out.print(true ? x:0);
		System.out.print(false ? i:x);
		
		/*console result:
		 *X88 
		 */
	}
}
