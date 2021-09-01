package day.hl2020_10_21;

public class ReverseList {

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        ListNode listNode = new ReverseList().reverseList(head);
        while(listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        while (head != null){
            ListNode temp = result;
            result = head;
            head = head.next;
            result.next = temp;
        }
        return result;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return val+"";
    }
}
