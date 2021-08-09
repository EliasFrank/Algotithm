package leetcode.editor.cn;
//剑指 Offer 21	
////输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。 
//
// 
//
// 示例： 
//
// 
//输入：nums = [1,2,3,4]
//输出：[1,3,2,4] 
//注：[3,1,2,4] 也是正确的答案之一。 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 50000 
// 1 <= nums[i] <= 10000 
// 
// Related Topics 数组 双指针 排序 
// 👍 146 👎 0


public class DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof{
    public static void main(String[] args) {
        Solution solution = new DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();
        int[] exchange = solution.exchange(new int[]{1, 2, 3, 4,5});
        for (int i = 0; i < exchange.length; i++) {
            System.out.print(exchange[i] + " ");
        }
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] exchange(int[] nums) {
        if (nums.length == 0) return nums;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (i < nums.length && nums[i] % 2 == 1)
                i++;
            while (j > 0 && nums[j] % 2 == 0)
                j--;
            if (i > j) return nums;
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}