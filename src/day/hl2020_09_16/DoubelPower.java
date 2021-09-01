package day.hl2020_09_16;

public class DoubelPower {
	public static void main(String[] args) {
		DoubelPower doubelPower = new DoubelPower();
		double result = doubelPower.myPow(-1, -2147483648);
		System.out.println(result);
		
		System.out.println(Math.pow(-1, -2147483648));
		System.out.println(-2147483648%2);
		
	}
	public double myPow(double x, int n) {
		if(x == 1) return 1;
		double result = 0;
		if(n == 0)
			result = 1;
		else if (n < 0)
			result = negPow(x, n);
		else result = posPow(x, n);
		
		return result;
    }
	public double negPow(double x, int n) {
		if(x == -1 && n%2 == -1) return -1;
		if(x == -1 && n%2 == 0) return 1;
		double result = 1;
		for(int i = n; i < 0; i++) {
			result /= x;
			if(result == 0)
				return 0;
		}
		return result;
    }
	public double posPow(double x, int n) {
		if(x == -1 && n%2 == 1) return -1;
		if(x == -1 && n%2 == 0) return 1;
		double result = 1;
		for(int i = n; i > 0; i--) {
			result *= x;
		}
		return result;
    }
}
