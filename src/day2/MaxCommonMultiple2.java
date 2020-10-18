package day2;

import java.util.Scanner;

public class MaxCommonMultiple2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		
		long max = getMax(n);
		System.out.println(max);
	}
	private static long getMax(Long n) {
		if(n < 2)
			return n;
		else if(n%2 != 0)
			return n*(n - 1)*(n - 2);
		else {
			if(n%3 == 0)
				return (n - 1)*(n - 2)*(n - 3);
			else return n*(n - 1)*(n - 3);
		}
	}
}
