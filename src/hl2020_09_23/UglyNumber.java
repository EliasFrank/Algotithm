package hl2020_09_23;

public class UglyNumber {
	public static void main(String[] args) {
		boolean result = new UglyNumber().isUgly(-2147483648);
		System.out.println(result);
	}
    public boolean isUgly(int num) {
    	if(num == 1) return true;
        boolean flag = false;
        while(num > 1 || num < -1){
            if(num % 2 == 0){
                flag = true;
                num /= 2;
            }
            if(num % 3 == 0){
                flag = true;
                num /= 3;
            }
            if(num % 5 == 0){
                flag = true;
                num /= 5;
            }
            if(!flag) return false;
            flag = false;
        }
        return true;
    }
}
