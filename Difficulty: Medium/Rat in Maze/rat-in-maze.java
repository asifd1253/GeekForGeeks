class Solution {
    int tot_rows;
    int tot_cols;
    boolean visited[][];
    ArrayList<String> res;
    
    public void solve(int maze[][], int curRow, int curCol, String curPath){
        if(curRow < 0 || curCol < 0 || curRow >= tot_rows || curCol >= tot_cols || maze[curRow][curCol] == 0){
            return;
        }
        
        if(visited[curRow][curCol] == true){
            return;
        }
        
        if(curRow == tot_rows-1 && curCol == tot_cols-1){
            res.add(curPath);
            return;
        }
        
        visited[curRow][curCol] = true;
        
        // up
        solve(maze, curRow-1, curCol, curPath+"U");
        // right
        solve(maze, curRow, curCol+1, curPath+"R");
        // down
        solve(maze, curRow+1, curCol, curPath+"D");
        // left
        solve(maze, curRow, curCol-1, curPath+"L");
        
        visited[curRow][curCol] = false;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        tot_rows = maze.length;
        tot_cols = maze[0].length;
        
        visited = new boolean[tot_rows][tot_cols];
        
        res = new ArrayList<>();
        
        solve(maze, 0, 0, "");
        
        Collections.sort(res);
        
        return res;
    }
}