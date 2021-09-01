package day.hl2020_09_25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(3);
		tree.left = new TreeNode(9);
//		tree.right = new TreeNode(20);
//		tree.left.left = new TreeNode(3);
//		tree.left.right = new TreeNode(4);
//		tree.right.left = new TreeNode(15);
//		tree.right.right = new TreeNode(7);
		List<List<Integer>> result = new LevelOrderBottom().levelOrderBottom(tree);
		for (List<Integer> list : result) {
			System.out.println(list.toString());
		}
		
	}
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if(root == null) return new ArrayList();
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		Queue<TreeNode> parent = new LinkedList<TreeNode>();
		parent.offer(root);
		while(!parent.isEmpty()) {
			List<Integer> children = new ArrayList<Integer>();
			int size = parent.size();
			for(int i = 0; i < size; i++) {
				TreeNode temp = parent.poll();
				children.add(temp.val);
				if(temp.left != null)
					parent.add(temp.left);
				if(temp.right != null)
					parent.add(temp.right);
			}
			if(!children.isEmpty()) 
				result.add(0, children);
		}
		return result;
    }
	private List<List<Integer>> Ê§°Ü1(TreeNode root) {
		if(root == null) return new ArrayList();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> temp = find(root.left, root.right, list);
		if(temp != null || !temp.isEmpty())
			list.add(temp);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(root.val);
		list.add(list2);
		return list;
	}
	private List<Integer> find(TreeNode left, TreeNode right, List<List<Integer>> list){
		if(left == null && right == null) return null;
		List<Integer> lone = new ArrayList<Integer>();
		List<Integer> ltwo = new ArrayList<Integer>();
		if(left != null)  lone = find(left.left, left.right, list);
		if(right != null) ltwo = find(right.left, right.right, list);
		if(lone != null && ltwo != null) {
			lone.addAll(ltwo);
			list.add(lone);
		}else if(ltwo != null && !ltwo.isEmpty()){
			list.add(ltwo);
		}else if(lone != null && !lone.isEmpty()){
			list.add(lone);
		}
		ArrayList<Integer> li = new ArrayList<Integer>();
		if(left != null)
			li.add(left.val);
		if(right != null)
			li.add(right.val);
		if(li.isEmpty()) return null;
		else return li;
	}
}
