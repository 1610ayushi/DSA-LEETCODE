class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int n = grid.length;
        
        if(grid[0][0]==1 || grid[n-1][n-1]==1)
            return -1;
        
        Queue<Pair<Integer, Integer>> q = new LinkedList();
        
        q.add(new Pair(0, 0));
        
        int[] dx = {0, 1, -1, 0, 1, -1, 1, -1};
        int[] dy = {1, 0, 0, -1, 1, -1, -1, 1};
        
        int sum = 1;
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            while(size-->0){
                
                Pair node = q.remove();
                
                int x = (int) node.getKey();
                int y = (int) node.getValue();
                
                if(x==n-1 && y==n-1)
                    return sum;
                
                for(int i=0; i<8; i++){
                    
                    int newX = x + dx[i];
                    int newY = y + dy[i];
                    
                    if(newX>=0 && newX<n && newY>=0 && newY<n
                       && grid[newX][newY]==0){
                        
                        grid[newX][newY] = 1;
                        q.add(new Pair(newX, newY));
                        
                    }
                }
                
            }
            sum++; 
        }
        return -1;
    }
}
