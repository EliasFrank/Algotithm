package test;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class test {
    public static void main(String[] args) {
        test2();
    }

    private static void test2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
//        list.remove(Integer.valueOf(3));
        System.out.println(list.hashCode());

        ArrayList<Integer> clone = (ArrayList<Integer>) list.clone();
        System.out.println(clone.hashCode());

        clone.remove(1);
        System.out.println(list);
        System.out.println(list == clone);
    }

    private static void test1() {
        int[] nums = {3, 4, 7, 1, 0};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.offer(nums[i]);
        }
        priorityQueue.stream().forEach(System.out::println);
    }
}
