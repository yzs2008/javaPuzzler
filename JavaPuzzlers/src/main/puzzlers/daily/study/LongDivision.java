package main.puzzlers.daily.study;
/**
 * 
 * @author kaidi
 *
 */
public class LongDivision {

	public static void main(String[] args) {
		final long longMax=Long.MAX_VALUE;
		System.out.println(longMax);
		System.out.println(Integer.MAX_VALUE);
		//the computation is performed entirely in integer arithmetic
		//and actually overflow.
		final long micro_per_day=24*60*60*1000*1000;
		//to fix the problem, use L to suffix the integer, just one is enough
		final long micro_per_day_fixed=24*60*60*1000*1000L;
		final long millis_per_day=24*60*60*1000;
		System.out.println(micro_per_day/millis_per_day);
		System.out.println(micro_per_day_fixed/millis_per_day);
	}

}
