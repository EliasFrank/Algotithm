package day.hl2020_09_02;

public class Rope {
	static int max = 0;
	public static void main(String[] args) {
		int  number = cuttingRope(10);
		System.out.println(number);
	}
	public static int cuttingRope(int n) {
		return 0;
		
	}
/*	��ѧ������ÿ�γ�����ͬ�ҳ���Ϊ3��ʱ��ֵ���
 * 
 * public static int cuttingRope(int n) {
	   if(n == 3) return n - 1;
       int a = n / 3;
       int b = n % 3;
       if(b == 0) return (int)Math.pow(3, a);
       if(b == 1) return (int)Math.pow(3, a - 1)*4;
       return (int)Math.pow(3, a)*2;
    }*/

}

/*
 * �ݹ�������
 * 	public static int getMax(int n, int mix) 
 * int temp = 0; if(n == 1) return mix > max ? mix : max; for(int i = 1; i < n;
 * i++) { temp = getMax(n - i, mix*i); if(temp > max) max = temp; } return max;
 * }
 */