//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];
        int res = 0;
        
        //initializatoin
        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = 0;
        }
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    res = Math.max(res, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        
        return res;
    }
}