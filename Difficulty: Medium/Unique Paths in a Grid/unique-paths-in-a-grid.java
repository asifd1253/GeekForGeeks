class Solution {
    int tot_rows;
    int tot_cols;
    int visited[][];
    
    public int solve(int grid[][], int curRow, int curCol){
        if( curRow>=tot_rows || curCol>=tot_cols || grid[curRow][curCol]==1){
            return 0;
        }
        
        if(visited[curRow][curCol] != -1){
            return visited[curRow][curCol];
        }
        
        if(curRow == tot_rows-1 && curCol == tot_cols-1){
            return 1;
        }
        
        int curRight=solve(grid, curRow, curCol+1);
        int curDown =solve(grid, curRow+1, curCol);
        
        visited[curRow][curCol] = curRight + curDown;
        
        return visited[curRow][curCol];
    }
    public int uniquePaths(int[][] grid) {
        // code here
        tot_rows=grid.length;
        tot_cols=grid[0].length;
        
        visited = new int[tot_rows][tot_cols];
        
        for(int i=0; i<tot_rows; i++){
            Arrays.fill(visited[i], -1);
        }
        
        return solve(grid, 0, 0);
    }
};