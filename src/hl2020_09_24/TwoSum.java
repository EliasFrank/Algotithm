package hl2020_09_24;

public class TwoSum {
	public static void main(String[] args) {
		int[] numbers = {5,25,75};
		int target = 100;
		int[] result = new TwoSum().twoSum(numbers, target);
		System.out.println(result[0] + " " + result[1]);
	}
	public int[] twoSum(int[] numbers, int target) {
		if(numbers == null || numbers.length == 0) return null;
		int a = 0;
		int b = numbers.length - 1;
		while(true) {
			if((numbers[a] + numbers[b]) > target)
				b--;
			else if((numbers[a] + numbers[b]) < target)
				a++;
			else return new int[] {a, b};
		}
    }
	private int[] ¶þ·Ö·¨(int[] numbers, int target) {
		if(numbers == null || numbers.length == 0) return null;
        for(int i = 0; i < numbers.length - 1; i++) {
        	int a = target - numbers[i];
        	int low = i + 1;
        	int high = numbers.length - 1;
        	int mid = 0;
        	while(low <= high) {
        		mid = (low + high) / 2;
        		if(numbers[mid] < a) low = mid + 1;
        		else if(numbers[mid] > a) high = mid - 1;
        		else {
        			return new int[] {i+1, mid+1};
        		}
        	}
        }
        return null;
	}
}
