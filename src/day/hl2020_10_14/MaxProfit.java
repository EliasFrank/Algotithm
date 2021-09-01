package day.hl2020_10_14;

public class MaxProfit {
	public static void main(String[] args) {
		int[] prices = {1,2,3,4,5};
		int result = new MaxProfit().maxProfit(prices);
		System.out.println(result);
	}
	public int maxProfit(int[] prices) {
        int i = 1;
        int peak = 0;
        int vally = 0;
        int result = 0;
        while(i < prices.length) {
        	while(i < prices.length && prices[i] < prices[i - 1])
        		i++;
        	vally = i - 1;
        	while(i < prices.length && prices[i] > prices[i - 1])
        		i++;
        	peak = i - 1;
        	result = result + (prices[peak] - prices[vally]);
        }
        return result;
    }
}
