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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;

        int i = 0;
        ListNode cur = head;
        while (cur != null) {
            i++;
            cur = cur.next;
        }

        if (i == n)
            return head.next;
        ListNode slo = head;
        ListNode fast = head;

        int j = 0;
        while (j < n && fast != null) {
            j++;
            fast = fast.next;
        }
        while (fast != null && fast.next != null) {
            slo = slo.next;
            fast = fast.next;
        }
        slo.next=slo.next.next;
        return head;
    }
}
