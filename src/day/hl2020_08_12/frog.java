package day.hl2020_08_12;

public class frog {
	public static void main(String[] args) {
		int num = numWays(50);
		System.out.println(num);
	}
	public static int numWays(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2; i < n + 1; i ++ ) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
		}
		
		return dp[n];
    }
}
