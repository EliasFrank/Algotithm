package hl2020_10_01;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    static List<String> combinations = new ArrayList<String>();
	public static void main(String[] args) {
		new GenerateParenthesis().generateParenthesis(3);
		for (String string : combinations) {
			System.out.println(string);
		}
	}

	public List<String> generateParenthesis(int n) {
        generateAll(new char[2 * n], 0);
        return combinations;
    }

    public void generateAll(char[] current, int pos) {
        if(pos == current.length) {
        	if(valid(current)) {
        		combinations.add(new String(current));
        		return;
        	}
        }else {
        	current[pos] = '(';
        	generateAll(current, pos + 1);
        	current[pos] = ')';
        	generateAll(current, pos + 1);
        }
    }

    public boolean valid(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') {
                ++balance;
            } else {
                --balance;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }
}
