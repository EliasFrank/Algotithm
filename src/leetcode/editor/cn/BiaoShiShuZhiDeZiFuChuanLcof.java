package leetcode.editor.cn;
//剑指 Offer 20	
////请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100"、"5e2"、"-123"、"3.1416"、"-1E-16"、"012
//3"都表示数值，但"12e"、"1a3.14"、"1.2.3"、"+-5"及"12e+5.4"都不是。 
//
// 
// Related Topics 数学 
// 👍 182 👎 0


import java.util.HashMap;
import java.util.Map;

public class BiaoShiShuZhiDeZiFuChuanLcof{
    public static void main(String[] args) {
        Solution solution = new BiaoShiShuZhiDeZiFuChuanLcof().new Solution();
        System.out.println(solution.isNumber("0"));
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isNumber(String s) {
        Map[] maps = {
                new HashMap<>(4) {{ put(' ', 0); put('s', 1); put('d', 2); put('.', 4); }}, // 0.
                new HashMap<>(4) {{ put('d', 2); put('.', 4); }},                           // 1.
                new HashMap<>(4) {{ put('d', 2); put('.', 3); put('e', 5); put(' ', 8); }}, // 2.
                new HashMap<>(4) {{ put('d', 3); put('e', 5); put(' ', 8); }},              // 3.
                new HashMap<>(4) {{ put('d', 3); }},                                        // 4.
                new HashMap<>(4) {{ put('s', 6); put('d', 7); }},                           // 5.
                new HashMap<>(4) {{ put('d', 7); }},                                        // 6.
                new HashMap<>(4) {{ put('d', 7); put(' ', 8); }},                           // 7.
                new HashMap<>(4) {{ put(' ', 8); }}                                         // 8.
        };

        int i = 0;
        char temp = 0;
        for (char c : s.toCharArray()){
            if (c >= '0' && c <= '9') temp = 'd';
            else if (c == ' ' || c == '.') temp = c;
            else if (c == 'e' || c == 'E') temp = 'e';
            else if (c == '+' || c == '-') temp = 's';
            else temp = '?';

            if (!maps[i].containsKey(temp)) return false;
            i = (int)maps[i].get(temp);
        }
        return i == 2 || i == 3 || i == 7 || i == 8;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}