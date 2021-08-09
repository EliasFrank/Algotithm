package leetcode.editor.cn;
//剑指 Offer 38	
////输入一个字符串，打印出该字符串中字符的所有排列。 
//
// 
//
// 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。 
//
// 
//
// 示例: 
//
// 输入：s = "abc"
//输出：["abc","acb","bac","bca","cab","cba"]
// 
//
// 
//
// 限制： 
//
// 1 <= s 的长度 <= 8 
// Related Topics 回溯算法 
// 👍 284 👎 0


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZiFuChuanDePaiLieLcof{
    public static void main(String[] args) {
        Solution solution = new ZiFuChuanDePaiLieLcof().new Solution();
        String[] permutation = solution.permutation("122");
        for (String s : permutation) {
            System.out.println(s);
        }
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        ArrayList<String> list = new ArrayList<>();
    public String[] permutation(String s) {
        if (s == null || s.length() == 0) return null;
        char[] chars = s.toCharArray();
        find(chars, 0);

        return list.toArray(String[]::new);
    }

    private void find(char[] s, int first) {
        if (first == s.length) {
            list.add(new String(s));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = first; i < s.length; i++) {
            if (set.contains(s[i])) continue;
            set.add(s[i]);

            swap(s, first, i);
            find(s, first + 1);
            swap(s, first, i);
        }
    }
    private void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}