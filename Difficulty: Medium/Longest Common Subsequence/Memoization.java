class Solution {
    public static int helper(String s1, String s2, int n, int m, int dp[][]){
        if(n == 0 || m == 0){
            return 0;
        }
        
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        
        //case- 1:
                    //-1 because index 0
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            dp[n][m] = helper(s1, s2, n-1, m-1,dp)+1;
        }else{   //diff 
            int ans1 = helper(s1, s2, n, m-1, dp);
            int ans2 = helper(s1, s2, n-1, m, dp);
            dp[n][m] = Math.max(ans1, ans2);
        }
        
        return dp[n][m];
    }
    // Function to find the length of the longest common subsequence in two strings.
    static int lcs(String s1, String s2) {
        // your code here
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        for(int i=0; i<s1.length()+1; i++){
            for(int j=0; j<s2.length()+1; j++){
                dp[i][j] = -1;
            }
        }
        
        return helper(s1, s2, s1.length(), s2.length(), dp);
    }
}
