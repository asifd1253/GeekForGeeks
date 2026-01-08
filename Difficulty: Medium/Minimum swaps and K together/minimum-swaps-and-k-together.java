// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        int n = arr.length;
        
        int winSize = 0;
        
        for(int i : arr){
            if(i <= k) winSize++;
        }
        
        int nonFav = 0;
        
        for(int i=0; i<winSize; i++){
            if(arr[i] > k) nonFav++;
        }
        
        int st = 0;
        int end = winSize;
        
        int res = nonFav;
        
        while(end < n){
            if(arr[end] > k) nonFav++;
            
            if(arr[st] > k) nonFav--;
            
            res = Math.min(res, nonFav);
            
            st++;
            end++;
        }
        
        return res;
    }
}
