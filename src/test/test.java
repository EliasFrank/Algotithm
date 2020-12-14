package test;

import java.util.PriorityQueue;

public class test {
    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 1, 0};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.offer(nums[i]);
        }
        priorityQueue.stream().forEach(System.out::println);
    }
}
