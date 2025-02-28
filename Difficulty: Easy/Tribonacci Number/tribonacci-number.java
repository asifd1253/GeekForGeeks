//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.nthTribonacci(n);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    static int tribo(int n, int dp[]){
        if(n==0 ){
            return n;
        }
        
        if(n==1 || n==2){
            return 1;
        }
        
        if(dp[n] != 0){
            return dp[n];
        }
        
        dp[n] = tribo(n-3, dp) + tribo(n-2, dp) + tribo(n-1, dp);
        
        return dp[n];
    }
    public static int nthTribonacci(int n) {
        // code here
        int dp[] = new int[n+1];
        
        return tribo(n, dp);
    }
}
