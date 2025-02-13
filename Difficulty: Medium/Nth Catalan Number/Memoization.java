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
