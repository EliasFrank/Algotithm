package hl2020_09_22;

import java.util.List;

public class GenerateTrees2 {
	int count = 0;
	public static void main(String[] args) {
		
	}
	public List<TreeNode> generateTrees(int n) {
		getTree(n);
		return null;
	}
	public void getTree(int n) {
		for (int i = 1; i <= n; i++) {
			getLeftChild(1, i - 1);
			getRightChild(i + 1, n);
		}
	}
	public TreeNode getLeftChild(int start, int end) {
		for(int i = start; i < end; i++) {
			getLeftChild(1, i - 1);
			getRightChild(i + 1, end);
		}
		return null;
	}
	public TreeNode getRightChild(int start, int end) {
		for(int i = start; i < end; i++) {
			getLeftChild(1, i - 1);
			getRightChild(i + 1, end);
		}
		return null;
	}
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
	    this.val = val;
	    this.left = left;
	    this.right = right;
	}
}