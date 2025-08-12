class Solution {
    int floorSqrt(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        
        int res = 0;
        
        int start = 1, end = n;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(mid <= n/mid){
                res = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return res;
    }
}
