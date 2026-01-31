// User function Template for Java

class Solution {
    static boolean isValidCap(int arr[], int maxAllowCap, int totDays){
        int noOfDays = 1;
        int curCap=0;
        
        for(int weight : arr){
            if(weight > maxAllowCap) return false;
            
            if(curCap+weight <= maxAllowCap){
                curCap += weight;
            }else{
                noOfDays++;
                curCap = weight;
            }
        }
        
        return (noOfDays<=totDays)?true:false;
    }
    static int leastWeightCapacity(int[] arr, int n, int d) {
        // code here
        int minCap = Integer.MAX_VALUE;
        int maxCap = 0;
        
        for(int w : arr){
            minCap = Math.min(minCap, w);
            maxCap = maxCap+w;
        }
        
        int st = minCap;
        int end = maxCap;
        
        int ans = -1;
        
        while(st <= end){
            int mid = st +(end-st)/2;
            
            if(isValidCap(arr, mid, d)){
                ans = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        
        return ans;
    }
};