class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        
        int len = tops.length;
        int min = Integer.MAX_VALUE;
        int [] arr = new int[2];
        
        arr[0] = tops[0];
        arr[1] = bottoms[0];
        
        for(int i = 0; i<2; i++){
            
            int topRot = 0;
            int bottomRot = 0;
            boolean flag = true;
            
            for(int j = 0; j<len; j++){
                if(tops[j]==arr[i] || bottoms[j]==arr[i]){
                    if(tops[j]!=arr[i])  topRot++;
                    else if(bottoms[j]!=arr[i])  bottomRot++;
                }
                else{
                    flag = false;
                    break;
                }
            }
            
            if(flag)    min = Math.min(topRot, bottomRot);
        }
        
        return min==Integer.MAX_VALUE?-1:min;
        
    }
}
