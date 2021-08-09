package leetcode.editor.cn;
//剑指 Offer 45	
////输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。 
//
// 
//
// 示例 1: 
//
// 输入: [10,2]
//输出: "102" 
//
// 示例 2: 
//
// 输入: [3,30,34,5,9]
//输出: "3033459" 
//
// 
//
// 提示: 
//
// 
// 0 < nums.length <= 100 
// 
//
// 说明: 
//
// 
// 输出结果可能非常大，所以你需要返回一个字符串而不是整数 
// 拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0 
// 
// Related Topics 排序 
// 👍 226 👎 0


import java.util.Arrays;

public class BaShuZuPaiChengZuiXiaoDeShuLcof{
    public static void main(String[] args) {
        Solution solution = new BaShuZuPaiChengZuiXiaoDeShuLcof().new Solution();
        String s = solution.minNumber(new int[]{3,30,34,5,9});
        System.out.println(s);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minNumber(int[] nums) {
        if (nums.length == 0) return "";
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        // Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        sort(strs, 0, nums.length - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);
        }
        return sb.toString();
    }
    private void sort(String[] nums, int start, int end) {
        if (start >= end) return;
        String tmp = nums[start];
        int i = start, j = end;
        while (i < j) {
            while(i < j && (tmp + nums[j]).compareTo(nums[j] + tmp) <= 0)
                j--;
            nums[i] = nums[j];
            while(i < j && (nums[i] + tmp).compareTo(tmp + nums[i]) <= 0)
                i++;
            nums[j] = nums[i];
        }
        nums[i] = tmp;

        sort(nums, start, i - 1);
        sort(nums, i + 1, end);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}