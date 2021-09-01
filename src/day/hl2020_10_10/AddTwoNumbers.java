package day.hl2020_10_10;

public class AddTwoNumbers {
	public static void main(String[] args) {

		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(9);
		
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode head = result;
        int store = 0;
        while(l1 != null || l2 != null) {
        	int a = 0;
        	int b = 0;
        	if(l1 != null){
        		a = l1.val;
            	l1 = l1.next;
        	}
        	if(l2 != null) {
            	b = l2.val;
            	l2 = l2.next;
        	}
        	int temp = a + b + store;
        	result.next = new ListNode(temp%10);
        	result = result.next;
        	store = temp/10;
        }
        if(store != 0) result.next = new ListNode(store);
        return head.next;
	}
}
