package day.hl2020_10_14;

public class HammingDistance {
	public static void main(String[] args) {
		int result = new HammingDistance().hammingDistance(3, 5);
		System.out.println(result);
	}
	public int hammingDistance(int x, int y) {
		int temp = 0;
		while(y != 0) {
			temp = x ^ y;
			y = (x & y) << 1;
			x = temp;
		}
		return x;
    }
}
