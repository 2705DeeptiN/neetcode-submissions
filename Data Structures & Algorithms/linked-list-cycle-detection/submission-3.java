/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slo=head;
        ListNode fast=head;
// if(head==null) return true;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slo=slo.next;
            fast=fast.next.next;

            if(slo==fast) return true;
        }
        return false;
        
    }
}
