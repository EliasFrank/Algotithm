package leetcode.editor.cn;
//剑指 Offer 32 - II	
////从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。 
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
//  [9,20],
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
//
// 注意：本题与主站 102 题相同：https://leetcode-cn.com/problems/binary-tree-level-order-tra
//versal/ 
// Related Topics 树 广度优先搜索 
// 👍 66 👎 0


import hl2020_09_25.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CongShangDaoXiaDaYinErChaShuIiLcof{
    public static void main(String[] args) {
        Solution solution = new CongShangDaoXiaDaYinErChaShuIiLcof().new Solution();
        
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
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root != null) {
            queue.offer(root);
        }
        int n = 0;
        while (queue.size() != 0){
            ArrayList<Integer> nums = new ArrayList<>();
            for (int i = queue.size(); i > 0 ; i--) {
                TreeNode treeNode = queue.poll();
                nums.add(treeNode.val);
                if(treeNode.left != null)
                    queue.offer(treeNode.left);
                if(treeNode.right != null)
                    queue.offer(treeNode.right);
            }
            list.add(nums);
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
/*
* ArrayList<TreeNode> nodes = new ArrayList<>();
    while(queue.size() != 0){
        nodes.add(queue.poll());
    }
    ArrayList<Integer> nums = new ArrayList<>();
    for (TreeNode treeNode:
         nodes) {
        nums.add(treeNode.val);
        if(treeNode.left != null)
            queue.offer(treeNode.left);
        if(treeNode.right != null)
            queue.offer(treeNode.right);
    }
    list.add(nums);
* */
}