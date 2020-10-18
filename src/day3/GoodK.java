package day3;

import java.util.Scanner;

public class GoodK {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int k = in.nextInt();
		int len = in.nextInt();
		
		int[][] nums = new int[len + 1][k + 1];
		
		for(int i = 0; i < k; i++)
			nums[1][i] = 1;
		
		for(int i = 2; i <= len; i++) {
			for(int j = 0; j < k; j++) {
				for(int now = 0; now < k; now++) {
					if((now - j != 1) && (now - j != -1)) {
						nums[i][j] += nums[i - 1][now];
						nums[i][j] %= 1000000007;
					}
				}
			}
		}
		int result = 0;
		for(int i = 1; i < k ; i++) {
			result += nums[len][i];
			result %= 1000000007;
		}
		System.out.println(result);
		
	}
}
