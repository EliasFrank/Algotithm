package day2;

import java.util.Scanner;

public class MaxCommonMultiple {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int tempMax;
		int max = 1;
		for(int i = 1; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n + 1 ; k++) {
					tempMax = getResult(i, j, k);
					if(tempMax > max)
						max = tempMax;
				}
			}
		}
		System.out.println(max);
	}
	private static int getResult(int a, int b, int c) {
		int k = a > b ? a : b;
		k = k > c ? k : c;
		for (int i = k; ; i++) 
			if(i % a == 0 && i % b == 0 && i % c == 0) {
				System.out.println(a + " " + b + " " + c +"==" + i);
				return i;
			}
	}
}
