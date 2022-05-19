/*
Given an m x n integers matrix, return the length of the longest increasing path in matrix.

From each cell, you can either move in four directions: left, right, up, or down. You may not move diagonally or move outside the boundary (i.e., wrap-around is not allowed).

 

Example 1:


Input: matrix = [[9,9,4],[6,6,8],[2,1,1]]
Output: 4
Explanation: The longest increasing path is [1, 2, 6, 9].
Example 2:


Input: matrix = [[3,4,5],[3,2,6],[2,2,1]]
Output: 4
Explanation: The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.
Example 3:

Input: matrix = [[1]]
Output: 1
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 200
0 <= matrix[i][j] <= 231 - 1
*/
class Solution {
    int[][] matrix, helper;
    int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int longestIncreasingPath(int[][] matrix) {
        helper = new int[matrix.length][matrix[0].length];
        this.matrix= matrix;
        int path = 0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) 
                path = Math.max(path, dfs(i, j));
        }
        
        return path;
    }
     
    private int dfs(int x, int y) {
        if (helper[x][y] != 0) return helper[x][y];
        for(int d=0;d<dirs.length;d++) {
            int i = dirs[d][0] + x, j = dirs[d][1] + y;
            if(i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length && matrix[x][y] < matrix[i][j]) {
                helper[x][y] = Math.max(helper[x][y], dfs(i, j));
            }
        }
        return ++helper[x][y];
    }
}
