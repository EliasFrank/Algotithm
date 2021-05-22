package leetcode.editor.cn;
//剑指 Offer 64	
////求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。 
//
// 
//
// 示例 1： 
//
// 输入: n = 3
//输出: 6
// 
//
// 示例 2： 
//
// 输入: n = 9
//输出: 45
// 
//
// 
//
// 限制： 
//
// 
// 1 <= n <= 10000 
// 
// 👍 309 👎 0


public class Qiu12nLcof{
    public static void main(String[] args) {
        Solution solution = new Qiu12nLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumNums(int n) {
        if (n <= 0) return 0;
        int a = n;
        int b = n - 1;
        while (a != 0) {
            int temp  = (a & b) << 1;
            b = a ^ b;
            a = temp;
        }
        b += sumNums(n - 2);
        return b;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}