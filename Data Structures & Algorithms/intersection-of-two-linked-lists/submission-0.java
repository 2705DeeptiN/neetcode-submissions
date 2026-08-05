/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode heada, ListNode headb) {
        
        ListNode ta=heada;
        ListNode tb=headb;
int l1=0;
int l2=0;
        while(ta!=null){
            ta=ta.next;
            l1++;
        }
        ta=heada;
        while(tb!=null){
            tb=tb.next;
            l2++;
        }
        tb=headb;
        if(l1>l2){
            for(int i=0;i<l1-l2;i++){
                ta=ta.next;
            }
        }
        else{
            for(int i=0;i<l2-l1;i++){
                tb=tb.next;
            }
        }

        while(ta!=tb){
            ta=ta.next;
            tb=tb.next;
        }
        return ta;
    }
}