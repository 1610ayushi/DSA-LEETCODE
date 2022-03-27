/*
You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.

 

Example 1:

Input: mat = 
[[1,1,0,0,0],
 [1,1,1,1,0],
 [1,0,0,0,0],
 [1,1,0,0,0],
 [1,1,1,1,1]], 
k = 3
Output: [2,0,3]
Explanation: 
The number of soldiers in each row is: 
- Row 0: 2 
- Row 1: 4 
- Row 2: 1 
- Row 3: 2 
- Row 4: 5 
The rows ordered from weakest to strongest are [2,0,3,1,4].
Example 2:

Input: mat = 
[[1,0,0,0],
 [1,1,1,1],
 [1,0,0,0],
 [1,0,0,0]], 
k = 2
Output: [0,2]
Explanation: 
The number of soldiers in each row is: 
- Row 0: 1 
- Row 1: 4 
- Row 2: 1 
- Row 3: 1 
The rows ordered from weakest to strongest are [0,2,3,1].
*/
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        //Create an array of size no. of rows present in mat
        int arr[] = new int[rows];
        for(int i = 0; i < rows; i++){
            int count1 = 0;
            for(int j = 0; j < cols; j++){
                if(mat[i][j] == 1){
                    count1++;
                }
            }
            arr[i] = count1;
        }   
        
        int ans[] = new int[k];//Create ans array of size k
        for(int i = 0; i < k; i++){
            int min = Ianteger.MAX_VALUE;
            int minIndex = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            ans[i] = minIndex;
            arr[minIndex] = Integer.MAX_VALUE;
        }
        
        return ans;
        
    }
}
