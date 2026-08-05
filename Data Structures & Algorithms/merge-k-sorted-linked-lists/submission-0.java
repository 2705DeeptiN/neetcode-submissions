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

 
// brute force
// put all elemnts fromm lists into arraylist
// then sort them
// for each elemnt in sorrted list create new node n goo on connectng

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> nodes = new ArrayList<>();

        for (ListNode li : lists) {
            while (li != null) {
                nodes.add(li.val);
                li = li.next;
            }
        }
        Collections.sort(nodes);

        ListNode res = new ListNode(0);
        ListNode cur = res;

        for (int node : nodes) {
            cur.next = new ListNode(node);
            cur = cur.next;
        }
        return res.next;
    }
}
