package day.hl2020_09_24;

public class LengthOfLIS {
	int result = 0;
	public static void main(String[] args) {
		int[] nums = {10,9,2,5,3,7,101,18};
		int result = new LengthOfLIS().lengthOfLIS(nums);
		System.out.println(result);
	}
	public int lengthOfLIS(int[] nums) {
		if(nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int max = 1;
        dp[0] = 1;
        for(int i = 1; i < nums.length; i++) {
        	dp[i] = 1;
    	    for(int j = 0; j < i; j++) {
    		    if(nums[i] > nums[j]) 
    		    	dp[i] = Math.max(dp[i], dp[j] + 1); 
    	    }
    	    max = Math.max(max, dp[i]);
        }
        return max;
    }
	private int error2(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
        	result = Math.max(find(nums, i + 1, nums[i]), result);
        }
        return result;
	}
	private int find(int[] nums, int i, int temp) {
		int max = 1;
		for(int j = i; j < nums.length; j++) {
			int tempMax = 1;
			if(nums[j] > temp)
				tempMax = find(nums, j + 1, nums[j]) + 1;
			max = max > tempMax ? max : tempMax;
		}
		return max;
	}
	private int error1(int[] nums) {
		int result = 0;
		int tempResult = 1;
        for(int i = 0; i < nums.length; i++) {
        	int temp = nums[i];
        	for(int j = i + 1; j < nums.length; j++) {
        		if(nums[j] > temp) {
        			temp = nums[j];
        			tempResult++;
        		}
        	}
        	if(tempResult > result)
        		result = tempResult;
    		tempResult = 1;
        }
        return result;
	}
}
