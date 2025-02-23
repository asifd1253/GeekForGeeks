//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().matrixMultiplication(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int mcmMemo(int arr[], int i, int j, int dp[][]){
        if(i == j){
            return 0;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++){
            int cost1 = mcmMemo(arr, i, k, dp);
            int cost2 = mcmMemo(arr, k+1, j, dp);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            
            ans = Math.min(ans, finalCost);
            
        }
        
        return dp[i][j] = ans;
    }
    static int matrixMultiplication(int arr[]) {
        // code here
        int n = arr.length;
        int dp[][] = new int[n][n];
        
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        
        return mcmMemo(arr, 1, n-1, dp);
    }
}