//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            // Read capacity
            int capacity = Integer.parseInt(br.readLine());

            // Read values
            String[] valInput = br.readLine().split(" ");
            int[] val = new int[valInput.length];
            for (int i = 0; i < valInput.length; i++) {
                val[i] = Integer.parseInt(valInput[i]);
            }

            // Read weights
            String[] wtInput = br.readLine().split(" ");
            int[] wt = new int[wtInput.length];
            for (int i = 0; i < wtInput.length; i++) {
                wt[i] = Integer.parseInt(wtInput[i]);
            }

            // Call the knapSack function and print the result
            System.out.println(Solution.knapSack(capacity, val, wt));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {
    public static int solution(int C, int val[], int wt[], int i, int dp[][]){
        // base case
        if(C == 0 || i == 0){
            return 0;
        }
        
        if(dp[i][C] != -1){
            return dp[i][C];
        }
        
        if(wt[i-1] <= C){
            // include 
            int ans1 = val[i-1] + solution(C-wt[i-1], val, wt, i-1, dp);
            
            // exclude
            int ans2 = solution(C, val, wt, i-1, dp);
            
            dp[i][C] = Math.max(ans1, ans2);
            return dp[i][C];
        }else{
            dp[i][C] = solution(C, val, wt, i-1, dp);
            return dp[i][C];
        }
        
       
    }
    // Function to return max value that can be put in knapsack of capacity.
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        int dp[][] = new int[val.length+1][capacity+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        
        return solution(capacity, val, wt, val.length, dp);
    }
}
