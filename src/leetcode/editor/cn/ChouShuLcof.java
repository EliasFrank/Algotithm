package leetcode.editor.cn;
//剑指 Offer 49	
////我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。 
//
// 
//
// 示例: 
//
// 输入: n = 10
//输出: 12
//解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。 
//
// 说明: 
//
// 
// 1 是丑数。 
// n 不超过1690。 
// 
//
// 注意：本题与主站 264 题相同：https://leetcode-cn.com/problems/ugly-number-ii/ 
// Related Topics 数学 
// 👍 176 👎 0


public class ChouShuLcof{
    public static void main(String[] args) {
        Solution solution = new ChouShuLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        int[] res = new int[1690];
    {
        res[0] = 1;
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < res.length; i++) {
            int n2 = res[a] * 2, n3 = res[b] * 3, n5 = res[c]*5;
            res[i] = Math.min(Math.min(n2, n3), n5);
            if (res[i] == n2) a++;
            if (res[i] == n3) b++;
            if (res[i] == n5) c++;
        }
    }
    public int nthUglyNumber(int n) {
        return res[n - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}