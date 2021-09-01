package day.hl2020_10_04;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    static List<String> combinations = new ArrayList<String>();
	public static void main(String[] args) {
		new GenerateParenthesis().generateParenthesis(4);
		for (String string : combinations) {
			System.out.println(string);
		}
		System.out.println(combinations.size());
	}

	public List<String> generateParenthesis(int n) {
        
        getAll(0, 0, n, new StringBuilder());
        return combinations;
    }
	public void getAll(int open, int close, int max, StringBuilder sb) {
		if(sb.length() == max*2) {
			combinations.add(sb.toString());
			return;
		}
		if(open < max) {
			sb.append('(');
			getAll(open + 1, close, max, sb);
			sb.deleteCharAt(sb.length() - 1);
		}
		if(open > close) {
			sb.append(')');
			getAll(open, close + 1, max, sb);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
//
//    public void generateAll(char[] current, int pos) {
//        if(pos == current.length) {
//        	if(valid(current)) {
//        		combinations.add(new String(current));
//        		return;
//        	}
//        }else {
//        	current[pos] = '(';
//        	generateAll(current, pos + 1);
//        	current[pos] = ')';
//        	generateAll(current, pos + 1);
//        }
//    }
//
//    public boolean valid(char[] current) {
//        int balance = 0;
//        for (char c: current) {
//            if (c == '(') {
//                ++balance;
//            } else {
//                --balance;
//            }
//            if (balance < 0) {
//                return false;
//            }
//        }
//        return balance == 0;
//    }
}
