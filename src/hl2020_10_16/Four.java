package hl2020_10_16;

public class Four {
	public static void main(String[] args) {
		my();
		other();
	}

	private static void other() {
		int n = 2019;
		int num = 0;
		for (int i = 1; i < n; i++) {
			if ((i + "").indexOf("2") != -1 || (i + "").indexOf("4") != -1)
				continue;
			for (int j = i + 1; j < n; j++) {
				if ((j + "").indexOf("2") != -1 || (j + "").indexOf("4") != -1)
					continue;
				int k = n - i - j;
				if (i == k || j == k || i == j)
					continue;
				if (k > 0 && (k + "").indexOf("2") == -1 && (k + "").indexOf("4") == -1)
					num++;
			}
		}
		System.out.println(num / 3);
	}

	private static void my() {
		int num = 2019;
		int count = 0;
		for(int i = 1; i < num; i++) {
			if((i + "").contains("2") || (i + "").contains("4"))
				continue;
			for(int j = 1; j < num - i; j++) {
				if((j + "").contains("2") || (j + "").contains("4"))
					continue;
				int temp = num - i - j;
				if((temp + "").contains("2") || (temp + "").contains("4"))
					continue;
				if(temp == i || i == j || j == temp) continue;
//				System.out.println(i + " " + j + " " + temp);
				count++;
			}
		}
		System.out.println(count/6);
	}
}
