/*Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.*/


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix.length==0)return false;
        int rows= matrix.length;
        int col= matrix[0].length;
        int left=0;
        int right=rows*col-1;
        while(left<=right){
            int midpoint= left+(right-left)/2;
            int midpoint_element= matrix[midpoint/col][midpoint%col];
            if(midpoint_element==target)return true;
            else if(target<midpoint_element){
                right=midpoint-1;}
            else if(target>midpoint_element){
                left=midpoint+1;
            }
        }
        return false;
        
        
    }
}

//2nd solution
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          int i = 0, j = matrix[0].length - 1;
      while(i < matrix.length && j >= 0) {
        if(matrix[i][j] == target)
          return true;
        else if(matrix[i][j] > target)
          j --;
        else if(matrix[i][j] < target)
          i ++;
      }
      return false;
        
        
    }
}
