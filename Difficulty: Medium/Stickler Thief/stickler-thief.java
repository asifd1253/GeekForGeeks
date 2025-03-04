//{ Driver Code Starts
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

            // calling method findMaxSum() of class solve
            System.out.println(new Solution().findMaxSum(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
   
    // Function to find the maximum money the thief can get.
    public int findMaxSum(int arr[]) {
      int n = arr.length;
      int dp[] = new int[n+1];
      dp[0] = 0;
      dp[1] = arr[0];
      
      for(int state=2; state<n+1; state++){
          int pick = arr[state-1] + dp[state-2];
          int notPick = 0 + dp[state-1];
          dp[state] = Math.max(pick, notPick);
      }
      
      
      return dp[n];
        
    }
}