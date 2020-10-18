package hl2020_09_24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Intersection {
	public static void main(String[] args) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] result = new Intersection().intersection(nums1, nums2);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < nums1.length; i++) {
			if(set.contains(nums1[i]))
				continue;
			for(int j = 0; j < nums2.length; j++) {
				if(nums1[i] == nums2[j]) {
					set.add(nums1[i]);
					break;
				}
			}
		}
		int[] result = new int[set.size()];
		Iterator<Integer> iterator = set.iterator();
		for(int i = 0; i < result.length; i++) {
			result[i] = iterator.next();
		}
		return result;
    }
}
