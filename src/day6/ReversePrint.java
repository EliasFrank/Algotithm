package day6;

import java.util.Stack;

public class ReversePrint {
	int len = 0;
	int[] nums = null;
	int i = 0;
	int[] reversePrint(ListNode head) {
       get(head); 
       return nums;
    }
	void get(ListNode head){
		if(head == null) {
			nums = new int[len];
			return;
		}
		else {
			head = head.next;
			len++;
			get(head);
		}
		nums[i] = head.val;
		i++;
	}
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}