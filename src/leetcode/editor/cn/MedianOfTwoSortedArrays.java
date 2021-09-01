package leetcode.editor.cn;
//4	
////给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 示例 3： 
//
// 
//输入：nums1 = [0,0], nums2 = [0,0]
//输出：0.00000
// 
//
// 示例 4： 
//
// 
//输入：nums1 = [], nums2 = [1]
//输出：1.00000
// 
//
// 示例 5： 
//
// 
//输入：nums1 = [2], nums2 = []
//输出：2.00000
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
// 
//
// 
//
// 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？ 
// Related Topics 数组 二分查找 分治 👍 4427 👎 0


import java.util.Arrays;

public class MedianOfTwoSortedArrays{
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
        double m = solution.findMedianSortedArrays(new int[]{1, 3, 4, 5, 6, 7, 8, 9}, new int[]{2, 2});
        System.out.println(m);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int len = len1 + len2;
        if (len % 2 == 1) {
            int mid = len / 2;
            return find(nums1, nums2, mid + 1);
        } else {
            int mid = len / 2 - 1;
            return (find(nums1, nums2, mid + 1) + find(nums1, nums2, mid + 2)) / 2.0;
        }
    }

    private double find(int[] nums1, int[] nums2, int mid) {
        int len1 = nums1.length, len2 = nums2.length;
        int k = mid;

        int i = 0, j = 0;
        while (true) {
            if (i >= len1)
                return nums2[j + k - 1];
            if (j >= len2)
                return nums1[i + k - 1];
            if (k == 1)
                return Math.min(nums1[i], nums2[j]);
    
            int half = k / 2;
            int ni = Math.min(i + half, len1) - 1;
            int nj = Math.min(j + half, len2) - 1;

            int l = nums1[ni];
            int r = nums2[nj];
            if (l <= r) {
                k = k - (ni - i + 1);
                i = ni + 1;
            } else {
                k -= nj - j + 1;
                j = nj + 1;
            }
        }
    }
}

    private double method1(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        boolean flag = false;
        if  (len % 2 == 0) flag = true;
        int bin = len / 2;
        if (nums1.length == 0) {
            return flag ? (nums2[bin - 1] + nums2[bin]) / 2.0 : nums2[bin];
        }
        if (nums2.length == 0) {
            return flag ? (nums1[bin - 1] + nums1[bin]) / 2.0 : nums1[bin];
        }
        int i = 0;
        int j = 0;
        int pre = nums1[0], cur = nums1[0];
        while (bin >= 0 && i < nums1.length && j < nums2.length) {
            pre = cur;
            if (nums1[i] > nums2[j]) {
                cur = nums2[j];
                j++;
            }
            else {
                cur = nums1[i];
                i++;
            }
            bin--;
        }
        while (bin >= 0 && i < nums1.length) {
            pre = cur;
            cur = nums1[i];
            i++;
            bin--;
        }
        while (bin >= 0 && j < nums2.length) {
            pre = cur;
            cur = nums2[j];
            j++;
            bin--;
        }
        return flag ? (pre + cur) / 2.0 : cur;
    }
//leetcode submit region end(Prohibit modification and deletion)

}