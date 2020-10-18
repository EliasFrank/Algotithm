package hl2020_10_18;

public class DeleteNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
        ListNode listNode = new DeleteNode().deleteNode(head, 5);
        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public ListNode deleteNode(ListNode head, int val) {
        return null;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
