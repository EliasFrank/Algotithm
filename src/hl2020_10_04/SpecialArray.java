package hl2020_10_04;

public class SpecialArray {
	public static void main(String[] args) {
		int[] nums = {0,4,3,0,4};
		int result = new SpecialArray().specialArray(nums);
		System.out.println(result);
	}
	public int specialArray(int[] nums) {
		for (int i = 0; i <= nums.length; i++) {
			int temp = 0;
			for(int j = 0; j < nums.length; j++) {
				if(nums[j] >= i) {
					temp++;
					if(temp > i) break;
				}
			}
			if(temp == i) return temp;
		}
		return -1;
    }
}
