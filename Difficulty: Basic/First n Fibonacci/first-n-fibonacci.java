// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        if(n == 1){
            return new int[]{0};
        }
        
        int res[] = new int[n];
        
        res[0] = 0;
        res[1] = 1;
        
        for(int i=2; i<n; i++){
            int prevSec = res[i-2];
            int prevFir = res[i-1];
            
            res[i] = prevSec + prevFir;
        }
        
        return res;
    }
}