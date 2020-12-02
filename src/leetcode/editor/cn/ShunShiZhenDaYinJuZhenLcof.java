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
import java.util.List;

public class ShunShiZhenDaYinJuZhenLcof{
    public static void main(String[] args) {
        Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        solution.spiralOrder(nums);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int[] result = new int[(right + 1) * (bottom + 1)];
        int num = 0;

        while (true){
            for (int i = left; i <= right; i++) {
                result[num++] = matrix[top][i];
            }
            if(++top > bottom){
                break;
            }
            for (int i = top; i <= bottom; i++) {
                result[num++] = matrix[i][right];
            }
            if(--right < left){
                break;
            }
            for (int i = right; i >= left; i--) {
                result[num++] = matrix[bottom][i];
            }
            if(--bottom < top){
                break;
            }
            for (int i = bottom; i >= top; i--) {
                result[num++] = matrix[i][left];
            }
            if(++left > right){
                break;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}