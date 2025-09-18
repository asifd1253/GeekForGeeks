class Solution {

    public int minCoins(int coins[], int sum) {
        // code here
        if(sum < 1) return 0;
        
        int dp[] = new int[sum+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[0] = 0;
        
        for(int amount=1; amount<=sum; amount++){
            for(int coin : coins){
                if(coin <= amount && dp[amount - coin] != Integer.MAX_VALUE){
                    dp[amount] = Math.min(dp[amount], dp[amount - coin] + 1);
                }
            }
        }
        
        return (dp[sum] != Integer.MAX_VALUE)?dp[sum]:-1;
    }
}