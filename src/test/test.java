package test;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class test {
    public static void main(String[] args) {
        test5();
    }

    private static void test5() {
        String s = "[a]";
    }

    private static void test4() {
        double v = Double.parseDouble("-123 ");
        System.out.println(v);
    }

    private static int test3(int a, int b) {

        while (a != 0) {
            int temp = 0;
            temp = (a & b) << 1;
            b = (a ^ b);
            a = temp;
        }
        return b;
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
