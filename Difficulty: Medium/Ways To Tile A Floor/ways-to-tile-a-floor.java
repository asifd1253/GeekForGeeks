class Solution {
    public int tiles(int dp[], int n){
        if(n==1 || n==0) return 1;
        
        if(dp[n] != 0){
            return dp[n];
        }
        return dp[n] = tiles(dp, n-1) + tiles(dp, n-2);
    }
    public int numberOfWays(int n) {
        // code here
        int dp[] = new int[n+1];
        
        // Arrays.fill(dp, -1);
        
        return tiles(dp, n);
    }
};