class Solution {
    int solve(int grid[][], int row, int col){
        if(row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] == 1){
            return 0;
        }
        
        if(row == rows-1 && col == cols-1){
            return 1;
        }
        
        if(visited[row][col] != -1){
            return visited[row][col];
        }
        
        int right = solve(grid, row, col+1);
        int down = solve(grid, row+1, col);
        
        return visited[row][col] = right+down;
    }
    
    int rows;
    int cols;
    int visited[][];
    
    public int uniquePaths(int[][] grid) {
        // code here
        rows = grid.length;
        cols = grid[0].length;
        visited = new int[rows][cols];
        
        for(int i=0; i<rows; i++){
            Arrays.fill(visited[i], -1);
        }
        
        if(grid[0][0] == 1 || grid[rows-1][cols-1] == 1){
            return 0;
        }
        
        return solve(grid, 0, 0);
    }
};