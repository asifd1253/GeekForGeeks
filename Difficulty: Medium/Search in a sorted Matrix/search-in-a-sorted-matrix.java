

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int row = 0;
        int col = mat[0].length-1;
        
        while(row <= mat.length-1 && col >= 0){
            if(mat[row][col] == x){
                return true;
            }else if(x > mat[row][col]){
                row++;
            }else{
                col--;
            }
        }
        
        return false;
    }
}
