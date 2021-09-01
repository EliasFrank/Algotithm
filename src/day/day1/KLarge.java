package day.day1;

import java.util.Scanner;
import java.util.Arrays;

public class KLarge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int count = in.nextInt();
		int[] nums = new int[count];
		
		for (int i = 0; i < nums.length; i++) 
			nums[i] = in.nextInt();
		
		int askNumber = in.nextInt();
		int[] result = new int[askNumber];
		
		for (int i = 0; i < askNumber; i++) {
			int start = in.nextInt() - 1;
			int end = in.nextInt() - 1;
			int k = in.nextInt() - 1;
			
			result[i]  = sort(Arrays.copyOfRange(nums, start, end + 1), k);
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	public static int sort(int[] nums, int k) {
		int max = 0;
		int flag = 0;
		for (int i = 0; i < nums.length; i++) {
			max = nums[i];
			flag = i;
			for(int j = i + 1; j < nums.length; j++) {
				if(max < nums[j]) {
					max = nums[j];
					flag = j;
				}
			}
			int tmpNum = nums[flag];
			nums[flag] = nums[i];
			nums[i] = max;
		}
		return nums[k];
	}
}
