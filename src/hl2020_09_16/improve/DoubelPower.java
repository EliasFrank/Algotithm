package hl2020_09_16.improve;

public class DoubelPower {
	public static void main(String[] args) {
		DoubelPower doubelPower = new DoubelPower();
		double result = doubelPower.myPow(2, 10);
		System.out.println(result);
		
		//System.out.println(Math.pow(-1, -2147483648));
		
	}
	public double myPow(double x, int n) {
		if(x == 1 || n == 0) return 1;
		long n2 = n;
		if(n2 < 0) {
			x = 1/x;
			n2 = -n2;
		}
		double result = 1;
		
		while(n2 > 0) {
			if(n2%2 == 1)
				result *= x;
			x *= x;
			n2 /= 2;
		}
		return result;
    }
}
