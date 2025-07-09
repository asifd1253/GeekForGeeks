class Solution {
    // Function to find all possible paths
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n = maze.length;
        ArrayList<String> res = new ArrayList<>();
        solve(maze, 0, 0, n, "", res);
        Collections.sort(res);
        return res;
    }
    
    public void solve(int mat[][], int row, int col, int n, String path, ArrayList<String> res){
        if(row < 0 || row >= n || col < 0 || col >= n || mat[row][col] == 0){
            return;
        }
        if(mat[row][col] == 2){  //marked as visited
            return;
        }
        
        if(row == n-1 && col == n-1){
            res.add(path);
            return;
        }
        
        int originalValue = mat[row][col];
        mat[row][col] = 2;
        
        solve(mat, row-1, col, n, path + "U", res);
        solve(mat, row, col+1, n, path + "R", res);
        solve(mat, row+1, col, n, path + "D", res);
        solve(mat, row, col-1, n, path + "L", res);
        
        mat[row][col] = originalValue;
    }
}