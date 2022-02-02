/**You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2,curr = dummyHead;
        int carry=0;
        while(p!=null|| q!=null){
            int x= (p!=null)?p.val:0;
            int y=(q!=null) ? q.val:0;
            int sum =carry+x+y;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr= curr.next;
            if(p!=null)p=p.next;
            if(q!=null)q=q.next;
        }
        if(carry>0){
            curr.next= new ListNode(carry);
        }
        return dummyHead.next;
    }
}



//2nd solution
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy= new ListNode();
        ListNode temp= dummy;
        int carry=0;
        while(l1 != null || l2 != null || carry==1){
            int sum=0;
            if(l1 != null){
                sum+= l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                sum+= l2.val;
                l2= l2.next;
            }
            sum+= carry;
            carry= sum/10;
            ListNode node= new ListNode(sum%10);
            temp.next= node;
            temp= temp.next;
        }
        return dummy.next;
    }
}
