package day.hl2020_10_13;

public class SortedArrayToBST {
	public static void main(String[] args) {
		int[] nums = {0, -10, -3, 5, 9};
		TreeNode result = new SortedArrayToBST().sortedArrayToBST(nums);
		System.out.println(result.val);
		System.out.println(result.left.val);
		System.out.println(result.left.right.val);
		System.out.println(result.right.val);
		System.out.println(result.right.right.val);
	}
	public TreeNode sortedArrayToBST(int[] nums) {
		TreeNode result = new TreeNode(nums[0]);
		for(int i = 1; i < nums.length; i++) {
			getBST(nums[i], result);
		}
		return result;
    }
	private void getBST(int num, TreeNode temp) {
		while(temp.right != null && num > temp.val)
			temp = temp.right;
		while(temp.left != null && num < temp.val)
			temp = temp.left;
		if(temp.val > num)
			temp.left = new TreeNode(num);
		else temp.right = new TreeNode(num);
	}
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}