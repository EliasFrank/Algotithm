package day7;

import java.util.HashMap;
import java.util.Map;

import day3.test;

public class tree {
	public static void main(String[] args) {
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		TreeNode tree = new Solution().buildTree(preorder, inorder);
		System.out.println(tree);
//		test(preorder, 0, preorder.length);
	}
	public static void test(int[] nums, int i, int j) {
		for(; i < j; i++) {
			System.out.println(nums[i]);
		}
	}
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	if(preorder == null || preorder.length == 0) {
    		return null;
    	}
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i = 0; i < inorder.length; i++)
    		map.put(inorder[i], i);
    	return add(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    	
    }
    public TreeNode add(int[] preorder, int ps, int pe, int[] inorder, int is, int ie, Map<Integer, Integer> map) {
    	if(ps > pe)
    		return null;
    	int val = preorder[ps];
    	int index = map.get(val);
    	
    	TreeNode root =  new TreeNode(val);
    	if(ps == pe)
    		return root;
    	int preLeft = index - is;
    	int preRight = ie - index;
    	root.left = add(preorder, ps + 1, ps + preLeft, inorder, is, index - 1, map);
    	root.right = add(preorder, pe - preRight + 1, pe, inorder, index + 1, ie, map);
    	
    	return root;
    }
}