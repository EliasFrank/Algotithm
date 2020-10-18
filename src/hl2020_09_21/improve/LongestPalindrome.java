package hl2020_09_21.improve;


public class LongestPalindrome {
	public static void main(String[] args) {
		String result = new LongestPalindrome().longestPalindrome("ababa");
		System.out.println(result);
	}
	
	public String longestPalindrome(String s) {
		
		int n = s.length();
		if(n < 1)
			return "";
		int start = 0;
		int end = 0;
		for(int i = 0; i < n; i++) {
			int len1 = getPalindromeLen(s, i, i);
			int len2 = getPalindromeLen(s, i, i + 1);
			
			int tempMaxLen = Math.max(len1, len2);
			if(tempMaxLen > end - start) {
				start = i - (tempMaxLen - 1)/2;
				end = i + tempMaxLen/2;
			}
		}
		return s.substring(start, end + 1);
	}
	private int getPalindromeLen(String s, int start, int end) {
		while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}
		return end - start - 1;
	}
}
