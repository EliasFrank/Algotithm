package day.hl2020_10_16;

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		int count = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int t = in.nextInt();
		int[][] items = new int[n + 1][t + 1];
		for(int i = 0; i < m; i++) {
			int one = in.nextInt();
			int two = in.nextInt();
			items[two][one]++;
		}
		in.close();
		int[] store = new int[n + 1];
		for(int i = 1; i <= t; i++) {
			for(int k = 1; k <= n; k++) {
				if(items[k][i] >= 1) 
					store[k] = store[k] + items[k][i]*2;
				else
					if(store[k] > 0) 
						store[k]--;
			}
		}
		for(int i = 1; i <= n; i++) {
			if(store[i] > 5) count++;
		}
		System.out.println(count);
	}
}
