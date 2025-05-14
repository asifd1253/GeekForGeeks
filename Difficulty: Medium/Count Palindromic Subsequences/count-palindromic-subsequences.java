//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String str = sc.nextLine();
            // System.out.println(str.length());
            Solution ob = new Solution();
            System.out.println(ob.countPS(str));
            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*You are required to complete below method */

class Solution {
    int dp[][];
    int countPS(String s) {
        // Your code here
        int n = s.length();
        dp = new int[n][n];
        
        for(int gap=0; gap<n; gap++){
            for(int i=0, j=gap; j<n; i++, j++){
                if(gap == 0){
                    dp[i][j] = 1;
                }else if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j] + dp[i][j-1] + 1;
                }else{
                    dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1];
                }
            }
        }
        
        return dp[0][n-1];
    }
}