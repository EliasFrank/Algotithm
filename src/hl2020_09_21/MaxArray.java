package hl2020_09_21;

public class MaxArray {
	
	public static void main(String[] args) {
		int[] nums = {-3, -2, -1, 0, 1, 2};
		maxSubArray(nums);
	}
	 public static int maxSubArray(int[] nums) {
	        int pre = 0, maxAns = nums[0];
	        for (int x : nums) {
	            pre = Math.max(pre + x, x);
	            maxAns = Math.max(maxAns, pre);
	        }
	        return maxAns;
	    }
}
