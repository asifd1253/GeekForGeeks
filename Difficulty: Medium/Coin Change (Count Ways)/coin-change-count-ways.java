//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int sum = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.count(arr, sum));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int count(int coins[], int sum) {
        // code here.
        int dp[][] = new int[coins.length+1][sum+1];
        
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 1;       //first row
        }
        
        for(int i=1; i<dp[0].length; i++){
            dp[0][i] = 0;       //first column
        }
        
        for(int i=1; i<coins.length+1; i++){
            for(int j=1; j<sum+1; j++){
                if(coins[i-1] <= j){    //valid
                
                                    //include           exclude
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        // return last cell 
        return dp[coins.length][sum];
    }
}