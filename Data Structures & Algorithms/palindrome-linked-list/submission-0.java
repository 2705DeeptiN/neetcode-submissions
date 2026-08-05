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
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;

        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;

            prev=cur;
            cur=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;

        ListNode slo=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slo=slo.next;
            fast=fast.next.next;
        }

        ListNode frst=head;
        ListNode sec=reverse(slo);

        while(sec!=null){
            if(frst.val!=sec.val)return false;
            frst=frst.next;
            sec=sec.next;
        }
        return true;
    }
}