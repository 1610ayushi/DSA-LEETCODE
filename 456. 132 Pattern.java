/*
Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].

Return true if there is a 132 pattern in nums, otherwise, return false.

 

Example 1:

Input: nums = [1,2,3,4]
Output: false
Explanation: There is no 132 pattern in the sequence.
Example 2:

Input: nums = [3,1,4,2]
Output: true
Explanation: There is a 132 pattern in the sequence: [1, 4, 2].
Example 3:

Input: nums = [-1,3,2,0]
Output: true
Explanation: There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
*/
class Solution
{
public boolean find132pattern(int[] nums)
{
if(nums == null || nums.length < 3)
return false;

     int s3 = Integer.MIN_VALUE; // to compare and update everytime we found new max     //after traverasing from back
     Stack<Integer> stk = new Stack();
     for(int i = nums.length-1;i>=0;i--)
     {
         if(nums[i]<s3) 
             return true;  
          while(!stk.isEmpty() && nums[i]>stk.peek())
          {
             s3 = stk.pop(); // we have to pop that num and change s3 to that no.
         }
         stk.push(nums[i]);
     }
    return false;
}
}
