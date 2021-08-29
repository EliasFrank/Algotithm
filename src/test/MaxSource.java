package test;

public class MaxSource {
    int row = 0;
    int col = 0;
    boolean[][] flag;
    int max = 0;

    public static void main(String[] args) {
        test11();
    }

    private static int[] test11() {
        int[] s = {1,2};
        s = new int[]{1,2};
        return new int[]{1,2};
    }

    public static String test10(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        // dp[i][j] 表示 s[i..j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        // 初始化：所有长度为 1 的子串都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
        // 递推开始
        // 先枚举子串长度
        for (int L = 2; L <= len; L++) {
            // 枚举左边界，左边界的上限设置可以宽松一些
            for (int i = 0; i < len; i++) {
                // 由 L 和 i 可以确定右边界，即 j - i + 1 = L 得
                int j = L + i - 1;
                // 如果右边界越界，就可以退出当前循环
                if (j >= len) {
                    break;
                }

                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                // 只要 dp[i][L] == true 成立，就表示子串 s[i..L] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    private static void test09() {
        String s = "ac";
        int count = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int last = i;
            while ((last = s.indexOf(s.charAt(i), last + 1)) != -1) {
                int j = i;
                int k = last;
                int tmp = 0;
                while(j <= k && s.charAt(j) == s.charAt(k)) {
                    j++;
                    k--;
                    if (j == k) tmp++;
                    else tmp += 2;
                }

                if (j > k) {
                    if (tmp > count) {
                        count = tmp;
                        start = i;
                        end = last;
                    }
                }
            }
        }
        String substring = s.substring(start, end + 1);
        System.out.println(substring);
    }

    private static void he() {
        int[][] map = {{9,6,0},
                       {5,8,7},
                       {1,9,0}};
        MaxSource maxSource = new MaxSource();
        int re = maxSource.max(map);
        System.out.println(re);
    }

    public int max(int[][] map){
        row = map.length;
        col = map[0].length;
        flag = new boolean[row][col];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                find(map, i, j, 0);
            }
        }
        return max;
    }
    private void find(int[][] map, int i, int j, int count) {
        if(i >= row || j >= col || i < 0 || j < 0) {
            max = Math.max(max, count);
            return;
        }
        if (map[i][j] == 0){
            max = Math.max(max, count);
            return;
        }
        if (flag[i][j]) {
            max = Math.max(max, count);
            return;
        }
        flag[i][j] = true;
        count += map[i][j];
        if (i < row)
            find(map, i + 1, j, count);
        if (i > 0)
            find(map, i - 1, j, count);
        if (j < col)
            find(map, i, j + 1, count);
        if (j > 0)
            find(map, i, j - 1, count);

        flag[i][j] = false;
    }
}
