package day.hl2020_09_23;

/**
 * [1,3,2,5]
   [2,1,3,null,4,null,7]
 * @author hl2333
 *
 */

public class MergeTrees {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.left.left = new TreeNode(5);
		t1.right = new TreeNode(2);
		
		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.left.right = new TreeNode(4);
		t2.right = new TreeNode(3);
		t2.right.right = new TreeNode(7);
		
		TreeNode result = new MergeTrees().mergeTrees(t1, t2);
		print(result);
	}
	static void print(TreeNode result) {
		if(result == null) return;
		System.out.print(result.val + " ");
		print(result.left);
		print(result.right);
	}
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		TreeNode node;
		if(t1 == null){
			return t2;
		}
		else if(t2 == null){
			return t1;
		}
		else {
			node = new TreeNode(t1.val + t2.val);
		}
		node.left = mergeTrees(t1.left, t2.left);
		node.right = mergeTrees(t1.right, t2.right);
		return node;
    }
}
