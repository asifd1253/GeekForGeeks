class Solution {
    public int memoDp(int n,int dp[]){
        // base case
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        
        dp[n] = memoDp(n-1,dp) + memoDp(n-2,dp);
        
        return dp[n];
    }
    // Function to count number of ways to reach the nth stair.
    int countWays(int n) {

        // your code here
        int dp[] = new int[n+1];
        dp[0] = 1;
        
        return memoDp(n,dp);
    }
}
