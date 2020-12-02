package leetcode.editor.cn;

public class HeBingLiangGePaiXuDeLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new HeBingLiangGePaiXuDeLianBiaoLcof().new Solution();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode listNode = solution.mergeTwoLists(l1, l2);
        while(listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

//leetcode submit region begin(Prohibit modification and deletion)




    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(-1);
            ListNode pre = head;
            while(l1 != null && l2!= null){
                if(l1.val < l2.val){
                    pre.next = l1;
                    l1 = l1.next;
                    pre = pre.next;
                }else{
                    pre.next = l2;
                    l2 = l2.next;
                    pre = pre.next;
                }
            }
            while (l1 != null){
                pre.next = l1;
                l1 = l1.next;
                pre = pre.next;
            }
            while (l2 != null){
                pre.next = l2;
                l2 = l2.next;
                pre = pre.next;
            }
            return head.next;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}