class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int rows = mat.length;
        int cols = mat[0].length;
        
        int st = 0;
        int end = rows*cols-1;
        
        int cLen = mat[0].length;
        
        while(st <= end){
            int mid = st + (end-st)/2;
            
            int rIdx = mid / cLen;
            int cIdx = mid % cLen;
            
            int midVal = mat[rIdx][cIdx];
            
            if(midVal == x){
                return true;
            }else if(x < midVal){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        
        return false;
    }
}
