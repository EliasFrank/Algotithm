package hl2020_08_13;

public class hello {

	static boolean flag  = false;
	public static void main(String[] args) {
		
		
//		char[][] board = {
//				{'a', 'b'},
//				{'c', 'd'}};
//		char[][] board = {
//				{'C','A','A'},
//				{'A','A','A'},
//				{'B','C','D'}};
		char[][] board = {
				{'a','a'},
				{'a','a'},
		};
//		 char[][] board = {
//				 {'A','B','C','E'},
//				 {'S','F','E','S'}, 
//				 {'A','D','E','E'}};
//		 
		String word = "aaaa";
		boolean result = exist(board, word);
		System.out.println(result);
	}
	public static boolean exist(char[][] board, String word) {
	
		char start = word.charAt(0);
		for(int i = 0; i <= board.length - 1; i++)
			for(int j  =0; j <= board[0].length - 1; j++) {
				if(board[i][j] == start) {
					if(word.length() == 1)
						return true;
					find(i, j, board, word, 0);
			        if(flag)
			        	return flag;
				}
			}
				
        return flag;
    }
	/*
	 * font 代表从哪个方向过来
	 * 1从左到右
	 * 2从上到下
	 * 3从右到左
	 * 4从下到上
	 * */
	public static void find(int i, int j, char[][] board, String word, int place) {
		if(i > board.length - 1 || j > board[0].length - 1 )
			return;
		if(board[i][j] != word.charAt(place))
			return ;

		if(board[i][j] == '/' )
			return;
		char temp = board[i][j];
		board[i][j] = '/'; 
		if(place == word.length() - 1) 
			flag = true;
		if(flag)
			return;
		if(i + 1 < board.length)
			find(i + 1, j, board, word, place + 1);
		if(i - 1 >= 0 )
			find(i - 1, j, board, word, place + 1);
		if(j + 1 < board[0].length )
			find(i, j + 1, board, word, place + 1);
		if(j - 1 >= 0 )
			find(i, j - 1, board, word, place + 1);
		board[i][j] = temp;  
			
	}
}
//[["A","B","C","E"],
// ["S","F","E","S"],
// ["A","D","E","E"]]
//"SEEEFS"

