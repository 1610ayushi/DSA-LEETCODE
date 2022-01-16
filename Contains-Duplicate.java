'''
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
'''

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null ||nums.length ==0 )return false;
        
        HashSet<Integer> set = new HashSet<Integer>();
    for(int i: nums){
        if(!set.add(i)){
            return true;
                }
                } 
    return false;
}
}
'''
