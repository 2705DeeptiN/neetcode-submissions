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
    ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode nxt = cur.next;
            cur.next = prev;

            prev = cur;
            cur = nxt;
        }
        return prev;
    }

    public ListNode kthnode(ListNode head, int k) {
        k--;

        ListNode cur = head;
        while (cur != null && k > 0) {
            cur = cur.next;
            k--;
        }
        return cur;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode kth = kthnode(temp, k);
            if (kth == null) {
                if (prev != null) {
                    prev.next = temp;
                }
                break;
            }

            ListNode nxt = kth.next;
            kth.next = null;

            ListNode newh = reverse(temp);

            if (temp == head)
                head = newh;
            else
                prev.next = newh;

            prev = temp;
            temp = nxt;
        }
        return head;
    }
}
