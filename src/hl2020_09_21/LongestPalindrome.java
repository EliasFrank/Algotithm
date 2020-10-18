package hl2020_09_21;

public class LongestPalindrome {
	public static void main(String[] args) {
		String result = new LongestPalindrome().longestPalindrome("abba");
		System.out.println(result);
	}
	
	public String longestPalindrome(String s) {
		int n = s.length();
		String result = "";
		boolean[][] dp = new boolean[n][n];
		for(int len = 0; len < n; len++) {
			for(int i = 0; i < n; i++) {
				int j = i + len;
				if(j >= n) continue;
				if (len == 0) {
					dp[i][j] = true; 
				}else if(len == 1){
					dp[i][j] = s.charAt(i) == s.charAt(j); 
				}else {
					dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j); 
				}
				if(dp[i][j] && len + 1 > result.length())
					result = s.substring(i, j + 1);
			}
		}
		return result;
	}
}
