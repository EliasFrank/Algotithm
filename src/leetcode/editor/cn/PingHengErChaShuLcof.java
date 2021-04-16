package leetcode.editor.cn;
//剑指 Offer 55 - II	
////输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。 
//
// 
//
// 示例 1: 
//
// 给定二叉树 [3,9,20,null,null,15,7] 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回 true 。 
// 
//示例 2: 
//
// 给定二叉树 [1,2,2,3,3,null,null,4,4] 
//
// 
//       1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
// 
//
// 返回 false 。 
//
// 
//
// 限制： 
//
// 
// 0 <= 树的结点个数 <= 10000 
// 
//
// 注意：本题与主站 110 题相同：https://leetcode-cn.com/problems/balanced-binary-tree/ 
//
// 
// Related Topics 树 深度优先搜索 
// 👍 124 👎 0


import hl2020_09_25.TreeNode;

public class PingHengErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new PingHengErChaShuLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        /*if (root == null)
            return true;
        find(root, 0);
        return isBalanced;*/
        return bfs(root) == -1 ? false : true;
    }

    private int bfs(TreeNode root) {
        if (root == null)
            return 0;
        int left = bfs(root.left);
        if (left == -1 ) return -1;
        int right = bfs(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }

/*
    private int find(TreeNode root, int i) {
        if (!isBalanced)
            return i;
        if (root.left == null && root.right == null)
            return i;

        int left = 0;
        if (root.left != null)
            left = find(root.left, i+1);
        int right = 0;
        if (root.right != null)
            right = find(root.right, i+1);

        if (Math.abs(left - right) > 1)
            isBalanced = false;
        return left > right ? left : right;
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)

}