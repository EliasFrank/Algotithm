package leetcode.editor.cn;
//剑指 Offer 16	
////实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 2.00000, n = 10
//输出：1024.00000
// 
//
// 示例 2： 
//
// 
//输入：x = 2.10000, n = 3
//输出：9.26100 
//
// 示例 3： 
//
// 
//输入：x = 2.00000, n = -2
//输出：0.25000
//解释：2-2 = 1/22 = 1/4 = 0.25 
//
// 
//
// 提示： 
//
// 
// -100.0 < x < 100.0 
// -231 <= n <= 231-1 
// -104 <= xn <= 104 
// 
//
// 
//
// 注意：本题与主站 50 题相同：https://leetcode-cn.com/problems/powx-n/ 
// Related Topics 递归 数学 
// 👍 182 👎 0


public class ShuZhiDeZhengShuCiFangLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZhiDeZhengShuCiFangLcof().new Solution();
        double v = solution.myPow(0, -2);
        System.out.println(v);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double myPow(double x, int n) {
//        Double.POSITIVE_INFINITY
//        if (x == 0) return 0;
        return n > 0 ? z(x, n) : f(x, n);
    }
    public double z(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        return myPow(x, n/2) * myPow(x, n/2) * myPow(x, n % 2);
    }
    public double f(double x, int n) {
        if (n == 0) return 1;
        if (n == -1) return 1/x;
        return myPow(x, n/2) * myPow(x, n/2) * myPow(x, n % 2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}