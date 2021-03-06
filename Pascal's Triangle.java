/*Given an integer numRows, return the first numRows of Pascal's triangle.  In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>result = new ArrayList<List<Integer>>();
        if(numRows==0) return result;
        List<Integer>prev= new ArrayList<Integer>();
        prev.add(1);
        result.add(prev);
        for(int i =1;i<numRows;i++){
            List<Integer>current= new  ArrayList<Integer>();
            current.add(1);
            for(int j=0;j<prev.size()-1;j++)
            {
                current.add(prev.get(j)+prev.get(j+1));
            }
            
            current.add(1);
            result.add(current);
            prev=current;
            
        }
        return result;
    }
}
