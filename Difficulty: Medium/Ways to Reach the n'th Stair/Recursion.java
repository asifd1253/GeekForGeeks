class Solution {
    // Function to count number of ways to reach the nth stair.
    int countWays(int n) {
        // your code here
        // Base case
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        
        return countWays(n-1) + countWays(n-2);
    }
}
