/*
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.*/
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k== 1)return head;
        ListNode dummy= new ListNode(0);
        dummy.next= head;
        ListNode curr= dummy, pre= dummy, nex= dummy;
         //calculate length of linkedlist
        int size=0;
        while(curr.next != null){
            curr= curr.next;
            size++;
        }
        while(size>= k){
            curr= pre.next;
            nex= curr.next;
            for(int i=1;i<k;i++){
                curr.next= nex.next;
                nex.next= pre.next;
                pre.next= nex;
                nex= curr.next;
            }
            pre= curr;
            size-=k;
            
        }
        return dummy.next;
        
        
    }
}
