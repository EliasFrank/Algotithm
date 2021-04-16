package leetcode.editor.cn;
//剑指 Offer 57	
////输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [2,7,11,15], target = 9
//输出：[2,7] 或者 [7,2]
// 
//
// 示例 2： 
//
// 输入：nums = [10,26,30,31,47,60], target = 40
//输出：[10,30] 或者 [30,10]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= nums.length <= 10^5 
// 1 <= nums[i] <= 10^6 
// 
// 👍 87 👎 0


public class HeWeiSdeLiangGeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new HeWeiSdeLiangGeShuZiLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            if (nums[low] + nums[high] > target)
                high--;
            else if (nums[low] + nums[high] < target)
                low++;
            else
                return new int[]{nums[low], nums[high]};
        }
        return new int[]{};
    }

    /*private boolean find(int[] nums, int temp, int i) {
        int low = i;
        int high = nums.length - 1;
        int mid = 0;

        while (high >= low) {
            mid = (low + high) / 2;
            if (nums[mid] > temp)
                high = mid - 1;
            else if (nums[mid] < temp)
                low = mid + 1;
            else
                return true;
        }
        return false;
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)

}