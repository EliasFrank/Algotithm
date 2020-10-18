package hl2020_10_15;

public class RomanToInt {
	public static void main(String[] args) {
		System.out.println(new RomanToInt().romanToInt("MCMXCIV"));
	}
	public int romanToInt(String s) {
		int result = 0;
		for(int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'I':
				if(i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
					result -= 1;
					break;
				}
				result += 1;
				break;
			case 'V':
				result += 5;
				break;
			case 'X':
				if(i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
					result -= 10;
					break;
				}
				result += 10;
				break;
			case 'L':
				result += 50;
				break;
			case 'C':
				if(i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
					result -= 100;
					break;
				}
				result += 100;
				break;
			case 'D':
				result += 500;
				break;
			case 'M':
				result += 1000;
				break;
			default:
				break;
			}
		}
		return result;
    }
}
