//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] mat = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    mat[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(mat);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find minimum time required to rot all oranges.
    public int orangesRotting(int[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        int freshCount = 0;
        
        Queue<int []> q = new LinkedList<>();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    freshCount++;
                }else if(grid[i][j] == 2){
                    q.add(new int[] {i,j});
                }
            }
        }
        
        if(freshCount == 0){
            return 0;
        }
        int time = 0;
        while(!q.isEmpty()){
            int size = q.size();
            
            // level by level
            for(int i=0; i<size; i++){
                int rottenLoc[] = q.remove();
                int r = rottenLoc[0];
                int c = rottenLoc[1];
                
                int neighbours[][] = {{r-1,c},{r,c+1},{r+1,c},{r,c-1}};
                
                for(int neighbour[] : neighbours){
                    int nr = neighbour[0];
                    int nc = neighbour[1];
                    
                    // out of bound - visited/rotten
                    if(nr < 0 || nc >= m || nr >= n || nc < 0 || grid[nr][nc] == 2 || grid[nr][nc] == 0){
                        continue;
                    }
                    
                    q.add(new int[] {nr,nc});
                    grid[nr][nc] = 2; // visited
                    
                    
                }
            }
            
            time++;
            freshCount -= q.size();
            
            if(freshCount == 0){
                break;
            }
        }
        
        return (freshCount == 0)?time:-1;
    }
}