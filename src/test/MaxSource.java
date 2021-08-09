package test;

public class MaxSource {
    int row = 0;
    int col = 0;
    boolean[][] flag;
    int max = 0;

    public static void main(String[] args) {
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
