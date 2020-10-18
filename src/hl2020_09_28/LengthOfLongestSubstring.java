package hl2020_09_28;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		int re = new LengthOfLongestSubstring().
				lengthOfLongestSubstring("ckilbkd");
		System.out.println(re);
	}
	public int lengthOfLongestSubstring(String s) {
		Set<Character> chars = new HashSet<Character>();
		int[] next = new int[s.length() + 1];
		int result = 0;
		next[0] = 0;
		int j = 0;
		for(int i = 0; i < s.length(); i++) {
			//"pwwkew"
			for(j = next[i]; j < s.length(); j++) {
				if(!chars.contains(s.charAt(j)))
					chars.add(s.charAt(j));
				else break;
			}
			next[i + 1] = j;
			result = Math.max(result, chars.size());
			chars.remove(s.charAt(i));
			if(result > s.length() - i) break;
		}
		return result;
    }
	private int ±©Á¦½â·¨(String s) {
		Set<Character> chars = new HashSet<Character>();
		int result = 0;
		for(int i = 0; i < s.length(); i++) {
			for(int j = i; j < s.length(); j++) {
				if(!chars.contains(s.charAt(j)))
					chars.add(s.charAt(j));
				else break;
			}
			result = Math.max(result, chars.size());
			chars.clear();
		}
		return result;
	}
}
