//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.longestPalinSubseq(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int lcs(String s, int i, int j, int dp[][]){
        if(i > j){
            return 0;
        }
        if(i == j){
            return 1;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        if(s.charAt(i) == s.charAt(j)){
            return dp[i][j] = 2 + lcs(s, i+1, j-1, dp);
        }else{
            return dp[i][j] = Math.max(lcs(s, i+1, j, dp), lcs(s, i, j-1, dp));
        }
    }
    public int longestPalinSubseq(String s) {
        // code here
        int n = s.length();
        int dp[][] = new int[n+1][n+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        
        return lcs(s, 0, n-1, dp);
    }
}