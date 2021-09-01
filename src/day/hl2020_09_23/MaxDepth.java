package day.hl2020_09_23;

public class MaxDepth {
	
	int max = 0;
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;
		depth(root, 0);
		return max;
    }
	public void depth(TreeNode node, int depth) {
		if(node == null) {
			max = depth < max ? max : depth;
			return ;
		}
		depth(node.left, depth + 1);
		depth(node.right, depth + 1);
	}
}
