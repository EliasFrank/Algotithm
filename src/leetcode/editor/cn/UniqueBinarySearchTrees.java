package leetcode.editor.cn;
//96	
////给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：5
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 19 
// 
// Related Topics 树 二叉搜索树 数学 动态规划 二叉树 👍 1296 👎 0


public class UniqueBinarySearchTrees{
    public static void main(String[] args) {
        Solution solution = new UniqueBinarySearchTrees().new Solution();
        int i = solution.numTrees(4);
        System.out.println(i);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numTrees(int n) {
        int[] g = new int[n + 1];
        g[0] = 1;
        g[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                g[i] += g[j - 1] * g[i - j];
            }
        }
        return g[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}