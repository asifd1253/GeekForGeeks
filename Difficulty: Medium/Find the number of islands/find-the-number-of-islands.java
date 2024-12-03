//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt(); // Number of test cases
        while (tc-- > 0) {
            int n = scanner.nextInt(); // Number of rows
            int m = scanner.nextInt(); // Number of columns
            char[][] grid = new char[n][m];

            // Read the grid input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.next().charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


class Solution {
    int rows;
    int cols;
   
    
    public void dfs(int row,int col,char[][] grid,boolean visited[][]){
        if(row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col]=='0' || visited[row][col]){
            return;
        }
        visited[row][col]= true;
        int adj[][] = {{-1,0},{0,1},{1,0},{0,-1},
                       {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
        };
        for(int neighbour[] : adj){
            dfs(row+neighbour[0],col+neighbour[1],grid,visited);
        }
    }
    public int numIslands(char[][] grid) {
        // Code here
        
        if(grid == null || grid.length == 0){
            return 0;
        }
        
        rows = grid.length;
        cols = grid[0].length;
        int islands = 0;
        boolean visited[][] = new boolean[rows][cols];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(i,j,grid,visited);
                    islands++;
                }
            }
        }
        
        return islands;
    }
}