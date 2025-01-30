//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String s1 = sc.next(); // Take both the strings as input
            String s2 = sc.next();

            Solution obj = new Solution();

            // Call the lcs function with the lengths of the strings as
            // parameters
            System.out.println(obj.lcs(s1, s2));
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the length of the longest common subsequence in two strings.
    static int lcs(String s1, String s2) {
        // your code here
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        
        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = 0;
        }
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        
        for(int i=1; i<s1.length()+1; i++){
            for(int j=1; j<s2.length()+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }
}