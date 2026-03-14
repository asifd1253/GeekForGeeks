// User function Template for Java

class Solution {
    public void Addition(int[][] matrixA, int[][] matrixB) {
        // code here
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                int sum = matrixA[r][c] + matrixB[r][c];
                matrixA[r][c] = sum;
            }
        }
    }
}