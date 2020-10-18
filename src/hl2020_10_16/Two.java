package hl2020_10_16;

import java.util.HashSet;
import java.util.Set;

public class Two {
	public static void main(String[] args) {
		String s = "0100110001010001";
		Set<String> set = new HashSet<String>();
		for(int i = 2; i <= s.length(); i++) {
			for(int j = 0; j + i <= s.length(); j++) {
				set.add(s.substring(j, j + i));
			}
		}
		System.out.println(set.size());
	}
}
