You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
  
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
         if(list1==null) return list2;
        if(list2==null) return list1;
        
        if(list2.val<list1.val)
        {
            ListNode temp = list1;
            list1=list2;
            list2=temp;
        }
        ListNode res = list1;
        //result node pointing the smaller one at beginning.
        while(list1!=null && list2!=null)
        {
            ListNode temp = null;
            while(list1!=null && list1.val<=list2.val)
            {
                temp =list1;
                list1=list1.next;
            }
            temp.next=list2;
            
            //swapping
            ListNode temp1 = list1;
            list1=list2;
            list2=temp1;
        }
        return res;
        
    }
}
