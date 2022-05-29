/*
Given a string array words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. If no such two words exist, return 0.

 

Example 1:

Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
Output: 16
Explanation: The two words can be "abcw", "xtfn".
Example 2:

Input: words = ["a","ab","abc","d","cd","bcd","abcd"]
Output: 4
Explanation: The two words can be "ab", "cd".
Example 3:

Input: words = ["a","aa","aaa","aaaa"]
Output: 0
Explanation: No such pair of words.
*/
class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        List<Set<Character>> lst = new ArrayList(n);
        int max = 0;

        for(String word : words) {	
            Set<Character> set = new HashSet();
            lst.add(set);
            for(int i=0; i<word.length(); i++) {
                set.add( word.charAt(i) );
            }
        }

        for(int i=0; i<n; i++) {
            Set<Character> setI = lst.get(i);
            for(int j=i+1; j<n; j++) {
                boolean hasCommon = false;
                Set<Character> setJ = lst.get(j);
                for(Character c : setI) {
                    if( setJ.contains(c) ) {
                        hasCommon = true;
                        break;
                    }
                }

                if( !hasCommon ) 
                    max = Math.max(max, words[i].length()*words[j].length());	
            }
        }
        return max;
    }
}
