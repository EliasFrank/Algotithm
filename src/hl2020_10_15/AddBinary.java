package hl2020_10_15;

public class AddBinary {
	public static void main(String[] args) {
		System.out.println(new AddBinary().addBinary("101111", "10"));
	}
	public String addBinary(String a, String b) {
        StringBuilder sBuilder  = new StringBuilder();
        int store = 0;
        int i, j;
        for(i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--) {
        	store = getAdd(a.charAt(i), b.charAt(j)) + store;
        	sBuilder.append(store%2);
        	store /= 2;
        }
        for(; i >= 0; i--) {
        	store = getAdd(a.charAt(i), '0') + store;
        	sBuilder.append(store%2);
        	store /= 2;
        }
        for(; j >= 0; j--) {
        	store = getAdd('0', b.charAt(j)) + store;
        	sBuilder.append(store%2);
        	store /= 2;
        }
        if(store == 1)
        	sBuilder.append('1');
        return sBuilder.reverse().toString();
    }
	private int getAdd(char a, char b) {
		return (a - '0') + (b - '0');
	}
}
