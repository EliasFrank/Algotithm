package day.hl2020_09_23;

import java.util.PriorityQueue;
class Table{
	long[] dp = new long[1690];
	public Table() {
		PriorityQueue<Long> queue = new PriorityQueue<Long>();
		queue.add(1L);
		int[] factor = {2, 3, 5};
		for(int i = 0; i < 1690; i++) {
			dp[i] = queue.poll();
			for(int j = 0; j < 3; j++) {
				long temp = factor[j] * dp[i];
				if(queue.contains(temp))
					continue;
				else queue.add(temp);
			}
		}
	}
}
public class UglyNumber2 {
	public static void main(String[] args) {
		int result = new UglyNumber2().nthUglyNumber(10);
		System.out.println(result);
	}
	Table table = new Table();
	public int nthUglyNumber(int n) {
		return (int)table.dp[n - 1];
    }
	public int nthUglyNumber1(int n) {
		int[] dp = new int[n];
		int p2 = 0;
		int p3 = 0;
		int p5 = 0;
		dp[0] = 1;
		for(int i = 1; i < n; i++) {
			dp[i] = Math.min(dp[p2]*2, Math.min(dp[p3]* 3 , dp[p5]*5));
			if(dp[i] == dp[p2]*2) p2++;
			if(dp[i] == dp[p3]*3) p3++;
			if(dp[i] == dp[p5]*5) p5++;
		}
		return dp[n-1];
    }
}
