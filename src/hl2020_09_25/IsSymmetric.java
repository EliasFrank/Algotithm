package hl2020_09_25;

public class IsSymmetric {
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(2);
		tree.left.left = new TreeNode(3);
		tree.left.right = new TreeNode(4);
		tree.right.left = new TreeNode(4);
		tree.right.right = new TreeNode(3);
		boolean result = new IsSymmetric().isSymmetric(tree);
		System.out.println(result);
	}
	public boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		return find(root.left, root.right);
    }
	private boolean find(TreeNode left, TreeNode right) {
		if(left == null && right == null) return true;
		if(left == null || right == null || left.val != right.val) {
			return false;
		}
		return find(left.left, right.right) && find(left.right, right.left);
	}
}
