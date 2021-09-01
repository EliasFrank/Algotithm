package day.hl2020_10_05;

import java.util.ArrayList;
import java.util.List;

public class Permute {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		Permute permute = new Permute();
		permute.permute(nums);
		for (List<Integer> i : permute.result) {
			System.out.println(i.toString());
		}
	}
	public List<List<Integer>> permute(int[] nums) {
		ArrayList<Integer> one = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++) {
			one.add(nums[i]);
			find(one, nums);
			one.remove(one.size() - 1);
		}
		return result;
    }
	private void find(List<Integer> list, int[] nums) {
		if(list.size() == nums.length){
			List<Integer> temp = new ArrayList<Integer>();
			temp.addAll(list);
			result.add(temp);
			return;
		}
		for(int i = 0; i < nums.length; i++) {
			if(list.contains(nums[i]))
				continue;
			list.add(nums[i]);
			find(list, nums);
			list.remove(list.size() - 1);
		}
	}
}
