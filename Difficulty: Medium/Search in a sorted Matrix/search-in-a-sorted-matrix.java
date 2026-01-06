class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        // code here
        if(mat.length == 0) return false;
        
        int rowLen = mat.length;
        int colLen = mat[0].length;
        
        int st = 0;
        int end = rowLen*colLen-1;
        
        while(st <=end){
            int mid = st + (end-st)/2;
            
            int rAdd = mid / colLen;
            int cAdd = mid % colLen;
            int val = mat[rAdd][cAdd];
            
            if(val == target){
                return true;
            }else if(val < target){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        
        return false;
    }
}
