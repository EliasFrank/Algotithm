package leetcode.editor.cn;
//剑指 Offer 12	
////给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。 
//
// 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。 
//
// 
//
// 例如，在下面的 3×4 的矩阵中包含单词 "ABCCED"（单词中的字母已标出）。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "AB
//CCED"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：board = [["a","b"],["c","d"]], word = "abcd"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= board.length <= 200 
// 1 <= board[i].length <= 200 
// board 和 word 仅由大小写英文字母组成 
// 
//
// 
//
// 注意：本题与主站 79 题相同：https://leetcode-cn.com/problems/word-search/ 
// Related Topics 数组 回溯 矩阵 
// 👍 366 👎 0


public class JuZhenZhongDeLuJingLcof{
    public static void main(String[] args) {
        Solution solution = new JuZhenZhongDeLuJingLcof().new Solution();
        char[][] map = {
                {'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}
        };
        String word = "ABCCEDASF";
        boolean exist = solution.exist(map, word);
        System.out.println(exist);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        String word = "";
        int row = 0;
        int col = 0;
        boolean flag = false;
        boolean[][] used;
    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0 || board == null || board.length == 0) return false;
        row = board.length;
        col = board[0].length;
        this.word = word;
        used = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (word.charAt(0) == board[i][j]) {
                    find(board, i, j, 1);
                }
            }
        }
        return flag;
    }

    private void find(char[][] board, int i, int j, int index) {
        used[i][j] = true;
        if (index == word.length()) {
            flag = true;
        }
        if (flag) return;

        if (i + 1 < row && !used[i + 1][j] && board[i + 1][j] == word.charAt(index)) {
            find(board, i + 1, j, index + 1);
        }
        if (j - 1 >= 0 && !used[i][j - 1] && board[i][j - 1] == word.charAt(index)) {
            find(board, i, j - 1, index + 1);
        }
        if (i - 1 >= 0 && !used[i - 1][j] && board[i - 1][j] == word.charAt(index)) {
            find(board, i - 1, j, index + 1);
        }
        if (j + 1 < col && !used[i][j + 1] && board[i][j + 1] == word.charAt(index)) {
            find(board, i, j + 1, index + 1);
        }
        used[i][j] = false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}