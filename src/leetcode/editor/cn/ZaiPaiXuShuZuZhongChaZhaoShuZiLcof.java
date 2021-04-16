package leetcode.editor.cn;
//剑指 Offer 53 - I	
////统计一个数字在排序数组中出现的次数。 
//
// 
//
// 示例 1: 
//
// 输入: nums = [5,7,7,8,8,10], target = 8
//输出: 2 
//
// 示例 2: 
//
// 输入: nums = [5,7,7,8,8,10], target = 6
//输出: 0 
//
// 
//
// 限制： 
//
// 0 <= 数组长度 <= 50000 
//
// 
//
// 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-
//position-of-element-in-sorted-array/ 
// Related Topics 数组 二分查找 
// 👍 83 👎 0


public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new ZaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();
        int[] nums = {5,7,7,8,8,10};
        int search = solution.search(nums, 6);
        System.out.println(search);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int left = find(nums, target, true);
        int right = find(nums, target, false);
        if (left == right) return 1;
        if (left <= right && right < nums.length && nums[left] == target && nums[right] == target) {
            return right - left;
        }
        return right - left;
    }
    private int find(int[] nums, int target, boolean flag){
        int l = 0;
        int r = nums.length - 1;
        int mid = (l + r) / 2;

        while(l <= r){
            mid = (l + r) / 2;
            if(nums[mid] > target || (flag && nums[mid] >= target))
                r = mid - 1;
            else l = mid + 1;
        }
        return mid;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
/*
* int left = 0;
        int right = nums.length - 1;
        int mid = (left+right)/2;
        while(left <= right){
            if(nums[mid] > target){
                right = mid - 1;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else {
                break;
            }
            mid = (left+right)/2;
        }
        if(left > right)
            return 0;
        int i;
        for(i = mid; i >= 0; i--){
            if(nums[i] != nums[mid]) {
                break;
            }
        }
        i++;
        int j;
        for (j = mid; j < nums.length; j++) {
            if(nums[j] != nums[mid]){
                break;
            }
        }
        j--;
        return j - i + 1;
    }
* */
}