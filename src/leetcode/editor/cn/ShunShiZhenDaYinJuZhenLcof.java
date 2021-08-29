package leetcode.editor.cn;
//剑指 Offer 29	
////输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 限制： 
//
// 
// 0 <= matrix.length <= 100 
// 0 <= matrix[i].length <= 100 
// 
//
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/ 
// Related Topics 数组 
// 👍 156 👎 0


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShunShiZhenDaYinJuZhenLcof{
    public static void main(String[] args) {
        Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();
//        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] nums = new int[0][0];
        int[] ints = solution.spiralOrder(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }

    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] spiralOrder(int[][] matrix) {
//        if (matrix.length == 0) return new int[0];

        LinkedList list = new LinkedList();

        if(matrix.length == 0 && matrix[0].length == 0)
            return new int[0];

        int row = matrix.length;
        int col = matrix[0].length;

        int a = 0, b = col - 1, c = row - 1, d = 0;
        int[] res = new int[row*col];
        int index = 0;

        while(true) {
            for (int i = d; i <= b; i++)
                res[index++] = matrix[a][i];
            if (++a > c) break;

            for (int i = a; i <= c; i++)
                res[index++] = matrix[i][b];
            if (--b < d) break;

            for (int i = b; i >= d; i--)
                res[index++] = matrix[c][i];
            if (--c < a) break;

            for (int i = c; i >= a; i--)
                res[index++] = matrix[i][d];
            if (++d > b) break;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}