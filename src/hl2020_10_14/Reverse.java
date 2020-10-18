package hl2020_10_14;

public class Reverse {
	public static void main(String[] args) {
		int re = new Reverse().reverse(123);
		System.out.println(re);
	}
	public int reverse(int x) {
		int result = 0;
		if(x < 0) {
			result = getReverse(-x);
			result = -result;
		}
		else result = getReverse(x);
		return result;
    }
	public int getReverse(int x) {
		long y = 0;
		while(x != 0) {
			y = y * 10 + x % 10;
			x = x / 10;
		}
		if(y < Integer.MAX_VALUE && y > Integer.MIN_VALUE) return (int)y;
		else return 0;
	}
}
