// User function Template for Java

class Solution {
    static boolean isValidCapacity(int weights[], int mid, int days){
        int noOfDays = 1;
        int sumOfWeights = 0;
        
        for(int weight : weights){
            //Edge case
            if(weight > mid){
                return false;
            }
            
            if(weight + sumOfWeights > mid){
                noOfDays++;
                sumOfWeights = weight;
            }else{
                sumOfWeights += weight;
            }
        }
        
        return (noOfDays <= days)?true:false;
    }
    
    static int leastWeightCapacity(int[] weights, int n, int days) {
        // code here
        int minCap = 0;
        int maxCap = 0;
        
        for(int weight : weights){
            minCap = Math.max(minCap, weight);
            maxCap += weight;
        }
        
        int ans = -1;
        while(minCap <= maxCap){
            int mid = minCap + (maxCap - minCap)/2;
            
            if(isValidCapacity(weights, mid, days)){
                ans = mid;
                maxCap = mid - 1;
            }else{
                minCap = mid + 1;
            }
        }
        
        return ans;
    }
};