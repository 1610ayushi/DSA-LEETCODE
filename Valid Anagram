Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;}
            char[] str1= s.toCharArray();
            char[] str2= t.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
        return Arrays.equals(str1,str2);
        
        
    }
}
