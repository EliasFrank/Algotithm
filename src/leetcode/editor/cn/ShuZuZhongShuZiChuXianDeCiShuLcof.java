package leetcode.editor.cn;
//剑指 Offer 56 - I	
////一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [4,1,4,6]
//输出：[1,6] 或 [6,1]
// 
//
// 示例 2： 
//
// 输入：nums = [1,2,10,4,1,4,3,3]
//输出：[2,10] 或 [10,2] 
//
// 
//
// 限制： 
//
// 
// 2 <= nums.length <= 10000 
// 
//
// 
// 👍 383 👎 0


public class ShuZuZhongShuZiChuXianDeCiShuLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongShuZiChuXianDeCiShuLcof().new Solution();
        solution.singleNumbers(new int[]{1,2,5,2});
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] singleNumbers(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a ^= nums[i];
        }
        int left = 0;
        int right = 0;
        int tmp = 1;
        while ((tmp & a) == 0)
            tmp <<= 1;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] & tmp) == 0)
                left ^= nums[i];
            else right ^= nums[i];
        }
        return new int[]{left, right};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}