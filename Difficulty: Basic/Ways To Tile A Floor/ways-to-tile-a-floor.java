class Solution {
    public static int tiling(int n, int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        
        return dp[n] = tiling(n-1, dp) + tiling(n-2, dp);
    }
    static int numberOfWays(int n) {
        // code here
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return tiling(n, dp);
    }
};