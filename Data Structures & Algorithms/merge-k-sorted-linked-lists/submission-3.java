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

/*optimal  o(nlogk)
 use heap to store heads of all 3 and then pop the value
the popped wil b smallest n add tht to next of dummy
in tht list move forwrd
keep repeating til null*/

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // PriorityQueue

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        for (ListNode li : lists) {
            if (li != null)
                pq.add(li);
        }

        while (!pq.isEmpty()) {
            ListNode smal = pq.poll();

            cur.next = smal;
            cur = smal;
            if (smal.next != null)
                pq.add(smal.next);
        }
        return dummy.next;
    }
}
