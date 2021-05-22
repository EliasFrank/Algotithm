package leetcode.editor.cn;
//剑指 Offer 32 - III	
////请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。 
//
// 
//
// 例如: 
//给定二叉树: [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [20,9],
//  [15,7]
//]
// 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 1000 
// 
// Related Topics 树 广度优先搜索 
// 👍 97 👎 0


import hl2020_09_25.TreeNode;

import java.util.*;

public class CongShangDaoXiaDaYinErChaShuIiiLcof{
    public static void main(String[] args) {
        Solution solution = new CongShangDaoXiaDaYinErChaShuIiiLcof().new Solution();
        
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<List<Integer>>();

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        LinkedList<Integer> temp = new LinkedList<>();
        Deque<TreeNode> list = new LinkedList();

        boolean flag = true;
        list.add(root);

        while (!list.isEmpty()) {
            LinkedList<Integer> floor = new LinkedList<>();
            int count = list.size();

            while (floor.size() < count) {
                TreeNode poll = list.poll();
                if (flag)
                    floor.addLast(poll.val);
                else
                    floor.addFirst(poll.val);

                if (poll.left != null) {
                    list.add(poll.left);
                }
                if (poll.right != null) {
                    list.add(poll.right);
                }
            }
            result.add(floor);
            flag = !flag;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}