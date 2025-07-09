// User function Template for Java

class Solution {
    
    static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //for column check
        for(int i=0; i<=8; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        
        //check for row
        for(int j=0; j<=8; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }
        
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        
        return true;
    }
    static boolean solve(int sudoku[][], int row, int col){
         // base case
        if(row == 9){
            return true;
        }
        
        //recursion
        int nextRow = row;
        int nextCol = col+1;
        if(col == 8){
            nextRow = row+1;
            nextCol = 0;
        }
        
        if(sudoku[row][col] != 0){
            return solve(sudoku, nextRow, nextCol);
        }
        
        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(solve(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        
        return false;
    }
    // Function to find a solved Sudoku.
    static void solveSudoku(int[][] sudoku) {
        // code here
        solve(sudoku, 0, 0);
    }
}