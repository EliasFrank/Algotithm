package leetcode.editor.cn;
//剑指 Offer 13	
////地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一
//格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但
//它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？ 
//
// 
//
// 示例 1： 
//
// 输入：m = 2, n = 3, k = 1
//输出：3
// 
//
// 示例 2： 
//
// 输入：m = 3, n = 1, k = 0
//输出：1
// 
//
// 提示： 
//
// 
// 1 <= n,m <= 100 
// 0 <= k <= 20 
// 
// Related Topics 深度优先搜索 广度优先搜索 动态规划 
// 👍 327 👎 0


public class JiQiRenDeYunDongFanWeiLcof {
    public static void main(String[] args) {
        Solution solution = new JiQiRenDeYunDongFanWeiLcof().new Solution();
        int i = solution.movingCount(41 , 29, 16);
        System.out.println(i);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int m, n, k;
    boolean[][] visited;
    int result;
    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        visited = new boolean[m][n];

        find(0, 0);
        return result;
    }
    public void find(int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n || visited[i][j]) {
            return;
        }
        if (!isBig(i, j)) return;
        if (!visited[i][j])
            result++;
        visited[i][j] = true;
        find(i + 1, j);
        find(i, j + 1);
    }
    private boolean isBig(int i, int j) {
        int sum = 0;
        for (; i != 0 && j != 0; i /= 10, j /= 10) {
            sum = sum + i % 10 + j % 10;
        }
        for (; i != 0; i /= 10) {
            sum += i % 10;
        }
        for (; j != 0; j /= 10) {
            sum += j % 10;
        }
        if (sum > k) return false;
        return true;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}