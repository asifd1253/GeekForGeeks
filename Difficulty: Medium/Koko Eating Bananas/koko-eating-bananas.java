class Solution {
    boolean canIEatInThisTime(int bananas[], int speed, int hours){
        int hour = 0;
        
        for(int banana : bananas){
            hour += (int)Math.ceil((double)banana / speed);
        }
        
        return hour <= hours;
    }
    
    public int kokoEat(int[] bananas, int hours) {
        // code here
        int minSpeed = 1;
        int maxSpeed = 0;
        for(int banana : bananas){
            maxSpeed = Math.max(maxSpeed, banana);
        }
        
        int ans = -1;
        while(minSpeed <= maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed)/2;
            
            if(canIEatInThisTime(bananas, mid, hours)){
                ans = mid;
                maxSpeed = mid - 1;
            }else{
                minSpeed = mid + 1;
            }
        }
        
        return ans;
    }
}
