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
        //Setting a dummy node for returning the new head;
        ListNode prehead = new ListNode(-1);
        //setting the prev node to prehead. This marks the begining
        ListNode prev=prehead;

        //Looping while list 1 & list 2 are not null
        while(list1!=null && list2!=null){
            /*if value of list 1 is <= list 2 value, 
            update the next pointer of prevous node to list1. 
            Because the value in list 2 cannot come before the value in list 1.
            then procced to next element in list1.*/
            if(list1.val<=list2.val){
                prev.next=list1;
                list1=list1.next;
            }
            /*else it means value in lit 2 >list one so, it has to go infront of List 1 value.
            so make next pointer in previous node to list 2 and move list 2 to next node in list 2;*/
            else{
                prev.next=list2;
                list2=list2.next;
            }
            //proceeding to
            prev=prev.next;

        }
        // Chances that either or list 1 or list 2 could be over
        // So we need to point the rest of the available list to the prev .next
        prev.next=list1==null?list2:list1;
        return prehead.next; // return the new head.
    }
}