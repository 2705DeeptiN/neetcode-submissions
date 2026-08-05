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

    public void reorderList(ListNode head) {
        ListNode slo = head;
        ListNode fast = head;

        // since v r using fast.next cndtn here mid will b at slo.next
        while (fast.next != null && fast.next.next != null) {
            slo = slo.next;
            fast = fast.next.next;
        }

        ListNode sec = reverse(slo.next);

        // Split the list
        slo.next = null;

        // Merge both halves
        ListNode frst = head;

        while (sec != null) {
            // since v shld link alternativly get their next node
            // 0 1 2    // 6 5 4
            // here frst=0 , sec=6 , f=1 , s=5
            // v join 0->6 thn  6->1 n incremnts f n s

            ListNode f = frst.next;
            ListNode s = sec.next;

            frst.next = sec;
            sec.next = f;

            // move current to atar mundind
            frst = f;
            sec = s;
        }
    }
}
