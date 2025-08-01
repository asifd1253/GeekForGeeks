class Solution {
    boolean isDivisorSmall(int arr[], int divisor, int threshold){
        int quotientSum = 0;
        
        for(int num : arr){
            quotientSum += (int)Math.ceil((double)num / divisor);
        }
        
        return (quotientSum <= threshold) ? true : false;
    }
    
    int smallestDivisor(int[] arr, int threshold) {
        // Code here
        int minDivisor = 1;
        int maxDivisor = 0;
        for(int i : arr){
            maxDivisor = Math.max(maxDivisor, i);
        }
        
        int ans = -1;
        
        while(minDivisor <= maxDivisor){
            int mid = minDivisor + (maxDivisor - minDivisor)/2;
            
            if(isDivisorSmall(arr, mid, threshold)){
                ans = mid;
                maxDivisor = mid - 1;  // who know small divisor will present
            }else{
                minDivisor = mid + 1;
            }
        }
        
        return ans;
    }
}