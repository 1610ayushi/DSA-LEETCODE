/*
Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.

 

Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
*/
class Solution {
    public String removeKdigits(String num, int k) {
         if(num.length()==k)
        return "0";
 
    StringBuilder sb = new StringBuilder(num);
    for(int j=0; j<k; j++){
        int i=0;
        while(i<sb.length()-1&&sb.charAt(i)<=sb.charAt(i+1)){
            i++;
        }
        sb.delete(i, i+1);
    }
 
    //remove leading 0's        
    while (sb.length() > 1 && sb.charAt(0)=='0')
        sb.delete(0,1);
 
    if(sb.length()==0){
        return "0";
    }
 
    return sb.toString();
        
    }
}
