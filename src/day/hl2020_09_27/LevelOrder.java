package day.hl2020_09_27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import day.hl2020_09_25.LevelOrderBottom;
import day.hl2020_09_25.TreeNode;

public class LevelOrder {
	public static void main(String[] args) {
		TreeNode tree = null;//new TreeNode(0);
//		tree.left = new TreeNode(9);
//		tree.right = new TreeNode(20);
//		tree.left.left = new TreeNode(3);
//		tree.left.right = new TreeNode(4);
//		tree.right.left = new TreeNode(15);
//		tree.right.right = new TreeNode(7);
		List<List<Integer>> result = new LevelOrderBottom().levelOrderBottom(tree);
		System.out.println(result);
		for (List<Integer> list : result) {
			System.out.println(list.toString());
		}
	}
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root == null) return new ArrayList();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		nodes.add(root);
		while(!nodes.isEmpty()) {
			List<Integer> queue = new ArrayList<Integer>();
			int size = nodes.size();
			for (int i = 0; i < size; i++) {
				TreeNode tempNode = nodes.poll();
				queue.add(tempNode.val);
				if(tempNode.left != null)
					nodes.add(tempNode.left);
				if(tempNode.right != null)
					nodes.add(tempNode.right);
			}
			result.add(queue);
		}
		return result;
    }
}
