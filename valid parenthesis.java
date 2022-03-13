/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false*/
class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack<Character> stack = new Stack();
        for(Character c : s.toCharArray())
           if(map.containsKey(c))
                stack.push(c);
            else if(!stack.isEmpty() && c == map.get(stack.peek()))
                stack.pop();
            else
                return false;
        return stack.isEmpty();
    }
}
