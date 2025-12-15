class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i : arr){
            curSum += i;
            
            maxSum = Math.max(maxSum, curSum);
            
            if(curSum < 0) curSum = 0;
        }
        
        return maxSum;
    }
}
