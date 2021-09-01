package day.hl2020_10_09;

public class MergeTwoLists {
	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode result = new MergeTwoLists().mergeTwoLists(l1, l2);
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null) return null;
		ListNode head = new ListNode(-1);
		ListNode node = head;
        while(l1 != null && l2 != null) {
        	if(l1.val <= l2.val) {
        		node.next = l1;
        		l1 = l1.next;
        	}else {
				node.next = l2;
				l2 = l2.next;
			}
        	node = node.next;
        }
        node.next = (l1 == null) ? l2 : l1;
        return head.next;
    }
	private ListNode ����(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null) return null;
		ListNode node = new ListNode(-1);
        while(l1 != null && l2 != null) {
        	if(l1.val <= l2.val) {
        		node = l1;
        		node = l1.next;
        	}
        	else {
        		node = l2;
        		node = l2.next;
        	}
        }
        node = (l1 == null) ? l2 : l1;
        return l1;
	}
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}