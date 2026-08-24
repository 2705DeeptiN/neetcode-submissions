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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int l1 = 0;
        int l2 = 0;
        ListNode ta = list1;
        ListNode tb = list2;

        while (ta != null) {
            ta = ta.next;
            l1++;
        }
        while (tb != null) {
            tb = tb.next;
            l2++;
        }
        ta = list1;
        tb = list2;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        while (ta != null && tb != null) {
            if (ta.val < tb.val) {
                t.next = ta;
                ta = ta.next;
            } else {
                t.next = tb;
                tb = tb.next;
            }
            t = t.next;
        }

        while (ta != null) {
            t.next = ta;
            ta = ta.next;
            t = t.next;
        }
        while (tb != null) {
            t.next = tb;
            tb = tb.next;
            t = t.next;
        }
        return dummy.next;
    }
}