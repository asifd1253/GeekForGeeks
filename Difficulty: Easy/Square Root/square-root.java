class Solution {
    int floorSqrt(int n) {
        // code here
        if(n==0 || n==1) return n;
        
        int start = 0;
        int end = n;
        
        int res = 0;
        
        while(start <= end){
            int midVal = start + (end - start)/2;
            
            if(midVal <= n/midVal){
                res = midVal;
                start = midVal+1;
            }else{
                end = midVal-1;
            }
        }
        
        return res;
    }
}
