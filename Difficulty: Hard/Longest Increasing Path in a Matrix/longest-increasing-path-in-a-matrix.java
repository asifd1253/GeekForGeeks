//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.longestIncreasingPath(arr, n, m));
            t--;
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int dfs(int matrix[][], int n, int m, int dp[][], int i, int j, int dir[][]){
        if(i<0 || i>=n || j>=m || j<0){
            return 0;
        }
        
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        
        int curr = 1;
        
        for(int direction[] : dir){
            int x = i + direction[0];
            int y = j + direction[1];
            
            if(x<0 || x>=n || y<0 || y>=m){
                continue;
            }
            
            if(matrix[x][y] <= matrix[i][j]){
                continue;
            }
            
            curr = Math.max(curr, 1 + dfs(matrix, n, m, dp, x, y, dir ));
        }
        
        dp[i][j] = curr;
        
        return curr;
    }
    /*You are required to complete this method*/
    int longestIncreasingPath(int matrix[][], int n, int m) {
        // Code here
        int maxLen = 1;
        int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
        
        if(matrix == null && (m ==0 || n ==0 ) ){
            return 0;
        }
        
        int dp[][] = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int curr = dfs(matrix, n, m, dp, i, j, dir);
                maxLen = Math.max(maxLen, curr);
            }
        }
        
        return maxLen;
        
    }
}