class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int maxSum = Integer.MIN_VALUE;
        
        int curSum = 0;
        
        for(int i=0; i<arr.length; i++){
            curSum = curSum + arr[i];
            
            maxSum = Math.max(maxSum, curSum);
            
            if(curSum < 0){
                curSum = 0;
            }
        }
        
        return maxSum;
    }
}
