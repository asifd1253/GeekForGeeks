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
            int res = obj.findCatalan(n);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int catalMemo(int n, int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        
        dp[n] = 0;
        
        for(int i=0; i<n; i++){
            dp[n] += catalMemo(i, dp) * catalMemo(n-1-i, dp);
        }
        
        return dp[n];
    }
    public static int findCatalan(int n) {
        // code here
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        
        return catalMemo(n, dp);
    }
}
