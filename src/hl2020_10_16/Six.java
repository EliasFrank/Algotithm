package hl2020_10_16;

import java.util.Scanner;

public class Six {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int result = 0;
		for(int i = 1; i <= n; i++) {
			String string = i + "";
			if(string.contains("2") || string.contains("0") || string.contains("1") ||string.contains("9")) {
				result += i;
			}
		}
		System.out.println(result);
	}
}
