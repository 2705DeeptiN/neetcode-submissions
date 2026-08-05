class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        ListNode slo = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
if(fast==null) return head.next;
        while(fast!=null && fast.next!=null){
            slo=slo.next;
            fast=fast.next;
        }
        slo.next=slo.next.next;

        return head;
    }
}
