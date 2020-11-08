package hl2020_10_20;

import java.util.ArrayList;

public class GetKthFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        ListNode listNode = new GetKthFromEnd().getKthFromEnd(head, 2);
        while(listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(k ==0) return null;
        ListNode result = head;
        ListNode front = head;
        for(int i = 0; i < k; i++)
            front = front.next;
        while (front != null){
            result = result.next;
            front = front.next;
        }
        return result;
    }

    private ListNode resolve1(ListNode head, int k) {
        if(k ==0) return null;
        ListNode result = null;
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        while(head != null) {
            list.add(head);
            head = head.next;
        }
        if (k > list.size())
            return list.get(0);
        result = list.get(list.size() - k);
        return result;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
