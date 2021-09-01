package day.hl2020_09_28;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumJewelsInStones {
	public static void main(String[] args) {
		String s1 = "aA";
		String s2 = "aAAbbbb";
		int result = new NumJewelsInStones().numJewelsInStones(s1, s2);
		System.out.println(result);
	}
	public int numJewelsInStones(String J, String S) {
		if(J == null || S == null || J.length() == 0 || S.length() == 0) return 0;
		int result = 0;
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i < J.length(); i++)
			set.add(J.charAt(i));
		for(int i = 0; i < S.length(); i++) {
			if(set.contains(S.charAt(i)))
				result++;
		}
		return result;
    }
	private int 不如暴搜的方法(String J, String S) {
		if(J == null || S == null || J.length() == 0 || S.length() == 0) return 0;
		int result = 0;
		Integer num = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < S.length(); i++) {
			if((num = map.get(S.charAt(i))) != null)
				map.put(S.charAt(i), map.get(S.charAt(i)) + 1);
			else map.put(S.charAt(i), 1);
		}
		for (int i = 0; i < J.length(); i++) {
			if((num = map.get(J.charAt(i))) != null)
				result += num;
		}
		return result;
	}
}
