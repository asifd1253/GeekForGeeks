
class Solution {
    // Function to return max value that can be put in knapsack of capacity.
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        int dp[][] = new int[val.length+1][capacity+1];
        for(int i=0; i<dp[0].length; i++){   //for row
           dp[0][i] = 0;
        }
        for(int i=0; i<dp.length; i++){    //for col
            dp[i][0] = 0;
        }
        
        for(int i=1; i<val.length+1; i++){
            for(int j=1; j<capacity+1; j++){
                int value = val[i-1];     //ith item value
                int weight = wt[i-1];     //ith item weight
                
                if(weight <= j){  //j-> act as capacity
                    int includeProfit = value + dp[i-1][j - weight];
                    int excludeProfit = dp[i-1][j];
                    dp[i][j] = Math.max(includeProfit, excludeProfit);
                }else{
                    int excludeProfit = dp[i-1][j];
                    dp[i][j] = excludeProfit;
                }
            }
        }
        
        return dp[val.length][capacity];
    }
}
