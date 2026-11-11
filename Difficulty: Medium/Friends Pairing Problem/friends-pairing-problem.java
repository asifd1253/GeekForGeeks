class Solution {
    public int countFriendsPairings(int n) {
        // code here
        if(n==0 || n==1){
            return n;
        }
        long dp[] = new long[n+1];
        
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + (i-1) * dp[i-2];
        }
        return (int)dp[n];
    }
}
