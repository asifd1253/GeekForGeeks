class Solution {
    public static int solution(int C, int val[], int wt[], int i){
        // base case
        if(C == 0 || i == 0){
            return 0;
        }
        
        if(wt[i-1] <= C){
            // include 
            int ans1 = val[i-1] + solution(C-wt[i-1], val, wt, i-1);
            
            // exclude
            int ans2 = solution(C, val, wt, i-1);
            
            return Math.max(ans1, ans2);
        }else{
            return solution(C, val, wt, i-1);
        }
        
       
    }
    // Function to return max value that can be put in knapsack of capacity.
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        return solution(capacity, val, wt, val.length);
    }
}
