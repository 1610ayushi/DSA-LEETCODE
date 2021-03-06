/*Given two stings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int l1=ransomNote.length();
        int l2=magazine.length();
        if(l2<l1)return false;
        int[] count = new int[26];
        for(char c:magazine.toCharArray()){
            count[c-'a']+=1;
            
        }
        for(char c:ransomNote.toCharArray()){
            if(count[c-'a']==0){  return false;}
        count[c-'a'] -= 1;
        }
        return true;
              
        
        
    }
}
