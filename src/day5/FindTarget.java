package day5;

public class FindTarget {
    static int[][] matrix = {
    			{1,   4,  7, 11, 15},
    			{2,   5,  8, 12, 19},
    			{3,   6,  9, 16, 22},
    			{10, 13, 14, 17, 24},
    			{18, 21, 23, 26, 30}};
    static int target = 30;
    static boolean flag = false;
    public static void main(String[] args) {
    	find(0, 0);
		System.out.println(flag);
	}
    public static void find(int i, int j){
        if(matrix[i][j] == target) {
            flag = true;
            return ;
        }
        if(matrix[i][j] < target && i+1 < matrix.length && j+1 < matrix[0].length
            && matrix[i+1][j] > target && matrix[i][j+1] > target){
            flag = false;
            return ;
        }
        if(i+1 < matrix.length && matrix[i+1][j] <= target)
            find(i + 1, j);
        if(j+1 < matrix[0].length && matrix[i][j+1] <= target)
            find(i, j + 1);
    }
}
