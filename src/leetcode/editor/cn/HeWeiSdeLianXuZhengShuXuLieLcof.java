package leetcode.editor.cn;
//剑指 Offer 57 - II	
////输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。 
//
// 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。 
//
// 
//
// 示例 1： 
//
// 输入：target = 9
//输出：[[2,3,4],[4,5]]
// 
//
// 示例 2： 
//
// 输入：target = 15
//输出：[[1,2,3,4,5],[4,5,6],[7,8]]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= target <= 10^5 
// 
//
// 
// 👍 236 👎 0


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class HeWeiSdeLianXuZhengShuXuLieLcof{
    public static void main(String[] args) {
        Solution solution = new HeWeiSdeLianXuZhengShuXuLieLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int[][] findContinuousSequence(int target) {
        List<int[]> result = new ArrayList<int[]>();

        for (int start = 1, end = 2; start < end; ) {
            int sum = ((end - start + 1) * (start + end)) / 2;
            if (sum == target) {
                int[] temp = new int[end - start + 1];
                for (int j = 0; j <= end - start; j++) {
                    temp[j] = start + j;
                }
                result.add(temp);
                start++;
            }
            else if (sum < target) {
                end++;
            }
            else {
                start++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    private void method1(int target, List<int[]> result) {
        for (int i = 0; i <= target / 2; i++) {
            int start = i + 1;
            int end = start + 1;
            int sum = ((end - start + 1) * (start + end)) / 2;
            while (sum < target) {
                end++;
                sum = ((end - start + 1) * (start + end)) / 2;
            }
            if (sum == target) {
                int[] temp = new int[end - start + 1];
                for (int j = 0; j <= end - start; j++) {
                    temp[j] = start + j;
                }
                result.add(temp);
                continue;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}