package hl2020_10_14;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int re = new RemoveDuplicates().removeDuplicates(nums);
		System.out.println(re);
	}
	public int removeDuplicates(int[] nums) {
		int i = 0;
		int min = Integer.MIN_VALUE;
		for(int j = 0; j < nums.length; j++) {
			if(nums[j] >  min){
				nums[i] = nums[j];
				i++;
				min = nums[j];
			}
		}
		for(int j = 0; j < i; j++) {
			System.out.print(nums[j]+" ");
		}
		System.out.println();
		return i;
    }
}
