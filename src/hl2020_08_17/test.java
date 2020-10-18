package hl2020_08_17;


public class test {
	int m;
	int n;
	int k;
	int result = 0;
	int[][] nums;
	public static void main(String[] args) {
		int result = new test().movingCount(38,15,9);
		System.out.println(result);
	}
//	public int movingCount(int m, int n, int k) {
//		this.k = k;
//		int j = 0;
//		for(int i = 0; i < m; i++) {
//			for(j = 0; j < n; j++) {
//				if(isBig(i, j)) {
//					break;
//				}else {
//					result++;
//				}
//			}
//			if(j == 0)
//				break;
//		}
//		return result;
//	}
	public int movingCount(int m, int n, int k) {
		this.m = m;
		this.n = n;
		this.k = k;
		nums = new int[m][n];
		find(0, 0);
		return result;
    }
	public void find(int i, int j) {
		if(i >= m || j >= n || i < 0 || j < 0)
			return;
		if (nums[i][j] == 1 ) 
			return;
		if(isBig(i, j))
			return;
		if(nums[i][j] == 0 )
			result++;
		nums[i][j]++;
		find(i + 1, j);
		find(i, j + 1);
			
	}
	public boolean isBig(int i, int j) {
		int sum = 0;
		while(i != 0) {
			sum  += i%10;
			i = i/10;
		}
		while(j != 0) {
			sum  += j%10;
			j = j/10;
		}
		if(sum > k) return true;
		return false;
	}
}
