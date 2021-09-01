package day.hl2020_10_10;

public class ReverseList {
	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode result = new ReverseList().reverseList(l1);
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
	public ListNode reverseList(ListNode head) {
		ListNode prev = new ListNode();
		ListNode curr = head;
		while(curr != null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return curr;
    }
	private ListNode 我的蠢办法(ListNode head) {
		ListNode first = new ListNode(-1);
		ListNode temp = null;
		while(head != null) {
			temp = first.next;
			first.next = new ListNode(head.val);
			first.next.next = temp;
			head = head.next;
		}
		return first.next;
	}
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}