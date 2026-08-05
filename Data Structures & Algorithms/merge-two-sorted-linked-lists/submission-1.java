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
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode ta=list1;
        ListNode tb=list2;

        while(ta!=null && tb!=null){
            if(ta.val<=tb.val){
                temp.next=ta;
                
                ta=ta.next;
            }
            else {
                temp.next=tb;
                 
                tb=tb.next;
        }
            temp=temp.next;
            
            }
            if(ta==null)temp.next=tb;
            else temp.next=ta;
        
        return dummy.next;
        
    }}
