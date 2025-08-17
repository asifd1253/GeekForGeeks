class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        // code here
        if(mat.length == 0){
            return false;
        }
        
        int m = mat.length;   // rows
        int n = mat[0].length; // cols
        
        int start = 0;
        int end = m*n-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            int r = mid / n;
            int c = mid % n;
            int val = mat[r][c];
            if(val == target){
                return true;
            }else if(target < val){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        return false;
    }
}
