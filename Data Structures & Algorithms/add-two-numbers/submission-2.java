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
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode t1 = head1;
        ListNode t2 = head2;

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        int c = 0;

        while (t1 != null || t2 != null) {
            int sum = c;

            if (t1 != null)
                sum += t1.val;
            if (t2 != null)
                sum += t2.val;

            ListNode nxt = new ListNode(sum % 10);
            c = sum / 10;

            cur.next = nxt;
            cur = cur.next;

            if (t1 != null)
                t1 = t1.next;
            if (t2 != null)
                t2 = t2.next;
        }
            if (c != 0) {
                ListNode n = new ListNode(c);
                cur.next = n;
                cur = cur.next;
            }
        
        return dummy.next;
    }
}
