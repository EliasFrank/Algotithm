package day.hl2020_09_23;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		heap.add(4);
		heap.add(2);
		heap.add(5);
		heap.add(3);
		heap.add(1);
		System.out.println(heap);
		System.out.println("======");
		heap.poll();
		System.out.println(heap);
		System.out.println("======");
		heap.poll();
		System.out.println(heap);
		System.out.println("======");
	}
}
