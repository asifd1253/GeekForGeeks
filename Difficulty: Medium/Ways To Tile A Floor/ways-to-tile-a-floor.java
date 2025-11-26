class Solution {
    int helper(int dp[], int n){
        if(n==0 || n==1) return 1;
        
        if(dp[n] != -1) return dp[n];
        
                    // vertical placed   horizontal placed
        return dp[n] = helper(dp, n-1) + helper(dp, n-2);
    }
    public int numberOfWays(int n) {
        // code here
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        
        return helper(dp, n);
    }
};