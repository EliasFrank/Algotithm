package leetcode.editor.cn;
//剑指 Offer 68 - I	
////给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。 
//
// 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（
//一个节点也可以是它自己的祖先）。” 
//
// 例如，给定如下二叉搜索树: root = [6,2,8,0,4,7,9,null,null,3,5] 
//
// 
//
// 
//
// 示例 1: 
//
// 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
//输出: 6 
//解释: 节点 2 和节点 8 的最近公共祖先是 6。
// 
//
// 示例 2: 
//
// 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
//输出: 2
//解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。 
//
// 
//
// 说明: 
//
// 
// 所有节点的值都是唯一的。 
// p、q 为不同节点且均存在于给定的二叉搜索树中。 
// 
//
// 注意：本题与主站 235 题相同：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a
//-binary-search-tree/ 
// Related Topics 树 
// 👍 81 👎 0


import hl2020_09_25.TreeNode;

import javax.swing.table.TableRowSorter;
import java.util.ArrayList;
import java.util.List;

public class ErChaSouSuoShuDeZuiJinGongGongZuXianLcof{
    public static void main(String[] args) {
        Solution solution = new ErChaSouSuoShuDeZuiJinGongGongZuXianLcof().new Solution();
        
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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (true) {
            if (root.val < p.val && root.val < q.val)
                root = root.right;
            else if (root.val > p.val && root.val > q.val)
                root = root.left;
            else break;
        }
        return root;
    }
    /*TreeNode result = null;
    boolean first = false;
    boolean second = false;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> p_path = getPath(root, p);
        List<TreeNode> q_path = getPath(root, q);

        for (int i = 0; i < p_path.size() && i < q_path.size(); i++) {
            if (p_path.get(i) == q_path.get(i))
                result = p_path.get(i);
            else break;
        }
        return result;
    }
    private List<TreeNode> getPath(TreeNode root, TreeNode p) {
        List<TreeNode> list = new ArrayList<>();
        while (root != null) {
            list.add(root);
            if (root == p) break;

            if (root.val > p.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return list;
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)

}