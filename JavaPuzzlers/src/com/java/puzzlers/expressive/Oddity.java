package com.java.puzzlers.expressive;

/**
 * 
 * @author kaidi
 * 
 */
public class Oddity {
	
	/**
	 * 1%2=1 
	 * -9%2=-1
	 * so the method will return wrong result when the i is negative.
	 * the definition of "%": (a/b)*b+(a%b)=a
	 */
	public static boolean isOdd(int i){
		return i%2==1;
	}
	/**
	 * the normal solution
	 */
	public static boolean isOdd_normal(int i){
		return i%2 ==1 || i%2 ==-1;
	}
	/**
	 * the better solution 
	 */
	public static boolean isOdd_better(int i){
		return i%2!=0;
	}
	/**
	 *the best solution 
	 */
	public static boolean isOdd_best(int i){
		return (i & 1)!=0;
	}

	public static void main(String[] args) {
		System.out.println("the puzzler method:");
		System.out.println(Oddity.isOdd(1));
		System.out.println(Oddity.isOdd(2));
		System.out.println(Oddity.isOdd(-9));

		System.out.println("the normal solution method:");
		System.out.println(Oddity.isOdd_normal(1));
		System.out.println(Oddity.isOdd_normal(2));
		System.out.println(Oddity.isOdd_normal(-9));

		System.out.println("the better solution method:");
		System.out.println(Oddity.isOdd_better(1));
		System.out.println(Oddity.isOdd_better(2));
		System.out.println(Oddity.isOdd_better(-9));

		System.out.println("the best solution method:");
		System.out.println(Oddity.isOdd_best(1));
		System.out.println(Oddity.isOdd_best(2));
		System.out.println(Oddity.isOdd_best(-9));
	}

}
