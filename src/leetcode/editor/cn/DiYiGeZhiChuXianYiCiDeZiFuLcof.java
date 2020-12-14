package leetcode.editor.cn;
//剑指 Offer 50	
////在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。 
//
// 示例: 
//
// s = "abaccdeff"
//返回 "b"
//
//s = "" 
//返回 " "
// 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 50000 
// Related Topics 哈希表 
// 👍 63 👎 0


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DiYiGeZhiChuXianYiCiDeZiFuLcof{
    public static void main(String[] args) {
        Solution solution = new DiYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();
        char c = solution.firstUniqChar("afaf");
        System.out.println(c);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char firstUniqChar(String s) {
        int[] words = new int[26];
        for (int i = 0; i < s.length(); i++) {
            words[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(words[s.charAt(i) - 'a'] == 1) return s.charAt(i);
        }
        return ' ';
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}