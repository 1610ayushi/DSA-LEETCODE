/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
*/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    helper(candidates, 0, target, 0, temp, result);
    return result;
}
 
private void helper(int[] candidates, int start, int target, int sum,
                    List<Integer> list, List<List<Integer>> result){
    if(sum>target){
        return;
    }
 
    if(sum==target){
        result.add(new ArrayList<>(list));
        return;
    }
 
    for(int i=start; i<candidates.length; i++){
        list.add(candidates[i]);
        helper(candidates, i, target, sum+candidates[i], list, result);
        list.remove(list.size()-1);
        
    }
}
}
