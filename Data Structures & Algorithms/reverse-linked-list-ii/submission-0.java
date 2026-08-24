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
     public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseBetween(ListNode head, int l, int r) {
        if (head == null || l == r)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode beforeleft = dummy;

        for (int i = 1; i < l; i++) {
            beforeleft = beforeleft.next;
        }

        ListNode leftnode = beforeleft.next; // this is excat lth node

        ListNode rytnode = leftnode;

        for (int i = l; i < r; i++) {
            rytnode = rytnode.next;
        }

        ListNode aftryt = rytnode.next;

        rytnode.next = null;

        ListNode torev = reverse(leftnode);
        beforeleft.next = torev;


        leftnode.next = aftryt;

        return dummy.next;
    }
}