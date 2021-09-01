package day.hl2020_10_19;

public class Exchange {
    public static void main(String[] args) {
        int[] nums = {1,7,4,3,5};
        int[] exchange = new Exchange().exchange(nums);
        for (int i = 0; i <  exchange.length; i++)
            System.out.print(exchange[i] + " ");
    }
    public int[] exchange(int[] nums){
        int head = 0;
        int end = nums.length - 1;
        int temp;
        while(end >= head){
            while(head <= nums.length - 1 && nums[head]%2 != 0)
                head++;
            while(end >= 0 && nums[end]%2 != 1)
                end--;
            if(end < head || end < 0 || head > nums.length - 1)
                break;
            temp = nums[head];
            nums[head] = nums[end];
            nums[end] = temp;
        }
        return nums;
    }
}
