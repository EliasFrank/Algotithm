package day.hl2020_09_28;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
	public static void main(String[] args) {
		int[] nums = {2, 2, 1};
		int result = singleNumber(nums);
		System.out.println(result);
	}
	public static int singleNumber(int[] nums) {
		int sign = 0;
		for (int i = 0; i < nums.length; i++) {
			sign ^= nums[i];
		}
		return sign;
    }
	private static int À¬»øËã·¨(int[] nums) {
		int num = 0;
		Set<Integer> set = new HashSet<Integer>();
		boolean flag = true;
		for(int i = 0; i < nums.length; i++) {
			flag = set.add(nums[i]);
			if(!flag) set.remove(nums[i]);
		}
		for (Integer integer : set) {
			num = integer;
		}
		return num;
	}
}
