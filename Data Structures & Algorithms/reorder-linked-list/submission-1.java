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
    public void reorderList(ListNode head) {
        List<ListNode> arr = new ArrayList<>();

        ListNode cur = head;
        // convetrt ll to arraylist
        while (cur != null) {
            arr.add(cur);
            cur = cur.next;
        }

        // hv start n end

        int i = 0;
        int j = arr.size() - 1;

        while (i < j) {
            // 0 1 2 whr i is at 0
            //  3 4 5 whr j is at 5

            // 0.next=5 and i cms at 1
            arr.get(i).next = arr.get(j);
            i++;
            if (i >= j)
                break;

            // now 5 shld b cntd to i tht is 1 0 5 1 n thn j reduce
            arr.get(j).next = arr.get(i);
            j--;
        }
        // last ge mark as null to end
        arr.get(i).next = null;
    }
}
