class Solution {
    boolean isValidSpeed(int arr[], int maxSpeedAllow, int totHours){
        int reqHours = 0;
        
        for(int bananas : arr){
            int curHours = (int)Math.ceil((double)bananas/maxSpeedAllow);
            
            if(curHours > totHours) return false;
            
            if(curHours+reqHours <= totHours){
                reqHours = reqHours + curHours;
            }else{
                return false;
            }
        }
        
        return reqHours <= totHours;
    }
    public int kokoEat(int[] arr, int k) {
        // code here
        int maxSpeed = 0;
        for(int i : arr){
            maxSpeed = Math.max(maxSpeed, i);
        }
        
        int st = 1;
        int end = maxSpeed;
        
        int ans = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            
            if(isValidSpeed(arr, mid, k)){
                ans = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        
        return ans;
    }
}
