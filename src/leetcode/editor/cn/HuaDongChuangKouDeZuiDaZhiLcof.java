package leetcode.editor.cn;
//剑指 Offer 59 - I	
////给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。 
//
// 示例: 
//
// 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
//输出: [3,3,5,5,6,7] 
//解释: 
//
//  滑动窗口的位置                最大值
//---------------               -----
//[1  3  -1] -3  5  3  6  7       3
// 1 [3  -1  -3] 5  3  6  7       3
// 1  3 [-1  -3  5] 3  6  7       5
// 1  3  -1 [-3  5  3] 6  7       5
// 1  3  -1  -3 [5  3  6] 7       6
// 1  3  -1  -3  5 [3  6  7]      7 
//
// 
//
// 提示： 
//
// 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。 
//
// 注意：本题与主站 239 题相同：https://leetcode-cn.com/problems/sliding-window-maximum/ 
// Related Topics 队列 滑动窗口 单调队列 堆（优先队列） 
// 👍 280 👎 0


import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class HuaDongChuangKouDeZuiDaZhiLcof{
    public static void main(String[] args) {
        Solution solution = new HuaDongChuangKouDeZuiDaZhiLcof().new Solution();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ints = solution.maxSlidingWindow(nums, k);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> queue = new LinkedList();
        for (int i = 0; i < k; i++) {

            while (queue.peekLast() != null && queue.peekLast() < nums[i]) {
                queue.pollLast();
            }
            queue.offer(nums[i]);
        }

        for (int i = 0; i < result.length - 1; i++) {
            result[i] = queue.peekFirst();
            if (queue.peekFirst() == nums[i]) {
                queue.pollFirst();
            }
            while (queue.peekLast() != null && queue.peekLast() < nums[i + k]) {
                queue.pollLast();
            }
            queue.offer(nums[i + k]);
        }
        result[result.length - 1] = queue.peekFirst();
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}