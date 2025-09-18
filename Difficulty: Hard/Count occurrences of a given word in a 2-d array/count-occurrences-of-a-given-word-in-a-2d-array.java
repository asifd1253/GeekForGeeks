// User function Template for Java

class Solution {
    int rows;
    int cols;
    
    int dfs(char mat[][], String target, boolean visited[][], int row, int col, int idx){
        if(row<0 || row>=rows || col<0 || col>=cols || visited[row][col] == true || mat[row][col] != target.charAt(idx)){
            return 0;
        }
        
        if(idx == target.length()-1){
            return 1;
        }
        
        int found = 0;
        
        visited[row][col] = true;
        
        found += dfs(mat, target, visited, row-1, col, idx+1);
        found += dfs(mat, target, visited, row, col+1, idx+1);
        found += dfs(mat, target, visited, row+1, col, idx+1);
        found += dfs(mat, target, visited, row, col-1, idx+1);
        
        visited[row][col] = false;
        
        return found;
    }
    
    public int findOccurrence(char mat[][], String target) {
        // Write your code here
        rows = mat.length;
        cols = mat[0].length;
        
        int count = 0;
        boolean visited[][] = new boolean[rows][cols];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(target.charAt(0) == mat[i][j]){
                    count += dfs(mat, target, visited, i, j, 0);
                }
            }
        }
        
        return count;
    }
}