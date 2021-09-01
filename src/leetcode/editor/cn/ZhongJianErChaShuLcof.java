package leetcode.editor.cn;
//剑指 Offer 07	
////输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。 
//
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 
//
// 
//
// 示例 1: 
//
// 
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-
//preorder-and-inorder-traversal/ 
// Related Topics 树 数组 哈希表 分治 二叉树 
// 👍 519 👎 0


import day.hl2020_09_25.TreeNode;

import java.util.HashMap;

public class ZhongJianErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new ZhongJianErChaShuLcof().new Solution();
        int[] preorder = new int[] {3,9,8,20,15,7};
        int[] inorder = new int[]{9,8,3,15,20,7};
        TreeNode treeNode = solution.buildTree(preorder, inorder);
        System.out.println(treeNode);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int pi = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, inorder, 0, inorder.length - 1);
    }
    private TreeNode build(int[] preorder, int[] inorder, int ii, int ij) {
        if (ii > ij) return null;
        if (ii == ij) {
            pi++;
            return new TreeNode(inorder[ii]);
        }

        int flag = map.getOrDefault(preorder[pi], -1);
        TreeNode root = new TreeNode(preorder[pi++]);
        root.left = build(preorder, inorder, ii, flag - 1);
        root.right = build(preorder, inorder, flag + 1, ij);
        return root;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
}