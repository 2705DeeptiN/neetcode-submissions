/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *}
 */

// trvrse all lists gvn..
// get min head frm all lists
// add it to dummy n move tht head frwrd

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while (true) {
            int min = -1;

            // go to tht each of k lists

            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null)
                    continue;

                // hosa minimu m bandr update min to i
                if (min == -1 || lists[min].val > lists[i].val) {
                    min = i;
                }
            }

            if (min == -1)
                break;

            // go tht particular elemnt lists[min]
            cur.next = lists[min];
            // move tht frwrd in list
            lists[min] = lists[min].next;
            // proceed fr allf
            cur = cur.next;
        }
        return dummy.next;
    }
}
