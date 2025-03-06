//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution ob = new Solution();

            if (ob.equalPartition(arr))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0; 
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        
        if(sum%2 == 1){
            return false;
        }
        
        int target = sum/2;
        boolean dp[][] = new boolean[n+1][target+1];
        
        //if the sum is 0 we always make a subset (empty set)
        for(int i=0; i<=n; i++){
            dp[i][0] = true;
        }
        
        //if we have 0 elements and target > 0 we cant from any subset
        for(int i=1; i<=target; i++){
            dp[0][i] = false;
        }
        
        
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=target; j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[n][target];
    }
}