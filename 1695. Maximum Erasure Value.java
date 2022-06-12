/*
You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.

Return the maximum score you can get by erasing exactly one subarray.

An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).

 

Example 1:

Input: nums = [4,2,4,5,6]
Output: 17
Explanation: The optimal subarray here is [2,4,5,6].
Example 2:

Input: nums = [5,2,1,2,5,2,1,2,5]
Output: 8
Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
 

Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 104
*/
class Solution {
   	public static int maximumUniqueSubarray(int[] nums) {

        // HashSet to check if the next value is unique.
		Set<Integer> set = new HashSet<>();
        
        // maxSum for the maximum score that we can get 
		int maxSum = 0;
        // currSum is used for the current sum of the iteration 
		int currSum = 0;

        // We have two pointer left and right 
        // r pointer will traverse the array and l will stay to indicate inital 
        // value for our current case 
		for (int l = 0, r = 0; r < nums.length; r++) {
            // let's add our next value 
			currSum += nums[r];
        // if the next element is already in the current set 
        // we need to move our l pointer 
    			if (set.contains(nums[r])) {
        // delete the values until we have found the non-unique value 
				while (nums[l] != nums[r]) {
					currSum -= nums[l];
					set.remove(nums[l]);
					l++;
				}
        // now we have found the non-unique value in our current case 
        // lets remove it both currSum and our set 
				if (nums[l] == nums[r]) {
					currSum -= nums[l];
					set.remove(nums[l]);
					l++;
				}
			}
        // add current value to the set 
			set.add(nums[r]);
        // compare the current case with previous cases to get maximum value .
			maxSum = Math.max(currSum, maxSum);

		}
		return maxSum;
	}
}
