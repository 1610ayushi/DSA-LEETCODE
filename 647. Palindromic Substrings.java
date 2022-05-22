/*
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.

 

Example 1:

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:

Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 

Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.*/
class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            
            // handle odd length palindrome (current character)
            count += palindromeCount(s, i, i);
            
            // handle even length palindrome (current character and next character)
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) { 
                count += palindromeCount(s, i, i + 1);
            }        
        }
        return count;     
    }
    
    public int palindromeCount(String str, int leftPointer, int rightPointer) {
        int count = 0;
        while(leftPointer >= 0 && rightPointer < str.length() && 
                  str.charAt(leftPointer) == str.charAt(rightPointer)) {
                count++;
                leftPointer--;
                rightPointer++;
        }
        
        return count;
    }
}
