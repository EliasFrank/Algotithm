package hl2020_09_22;

public class GenerateTrees {
	public static void main(String[] args) {
		int result = new GenerateTrees().numTrees(3);
		System.out.println(result);
	}
	public int numTrees(int n) {
		if(n < 1) return n;
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i < dp.length; i++) {
			
		}
		return dp[n];
	}
}