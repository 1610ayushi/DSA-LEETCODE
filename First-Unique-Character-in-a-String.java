//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

/*Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
*/

class Solution {
    public int firstUniqChar(String s) {
          HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        for(int i =0;i<n;i++){
            char c= s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            if(count.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
