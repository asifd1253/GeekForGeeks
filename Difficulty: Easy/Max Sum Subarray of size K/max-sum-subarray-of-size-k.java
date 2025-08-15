class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int maxSum = 0;
        int curSum = 0;
        
        int idx = 0;
        while(idx < n && idx < k){
            curSum += arr[idx];
            idx++;
        }
        
        maxSum = curSum;
        
        for(int i=1; i<n-k+1; i++){
            int removeEle = arr[i-1];
            int addEle = arr[i+k-1];
            curSum = curSum - removeEle + addEle;
            maxSum = Math.max(maxSum, curSum);
        }
        
        return maxSum;
    }
}