package leetcode.editor.cn;
//剑指 Offer 46	
////给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可
//能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。 
//
// 
//
// 示例 1: 
//
// 输入: 12258
//输出: 5
//解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi" 
//
// 
//
// 提示： 
//
// 
// 0 <= num < 231 
// 
// 👍 233 👎 0


public class BaShuZiFanYiChengZiFuChuanLcof{
    public static void main(String[] args) {
        Solution solution = new BaShuZiFanYiChengZiFuChuanLcof().new Solution();
        int i = solution.translateNum(506);
        System.out.println(i);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int translateNum(int num) {
        if (num == 0) return 1;
        int a = 1;
        int b = 1;
        int c = 1;
        while (num > 0) {
            if ((num % 100) > 25 || (num % 100) < 10) {
                c = b;
            } else {
                c = b + a;
            }
            a = b;
            b = c;
            num /= 10;
        }
        return c;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}