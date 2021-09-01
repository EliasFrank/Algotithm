package day.hl2020_09_23;

public class InvertTree {
	TreeNode temp = new TreeNode(0);
	public TreeNode invertTree(TreeNode root) {
		invert(root);
		return root;
	}
	public void invert(TreeNode root){
		if(root == null) return;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		invert(root.left);
		invert(root.right);
		
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

