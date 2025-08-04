class Solution {
    boolean isAllocationPossible(int stalls[], int minDistTwoCows, int targetCows){
        int cows = 1;
        int lastCowStandIdx = 0;
        
        for(int i=1; i<stalls.length; i++){
            if(stalls[i] - stalls[lastCowStandIdx] >= minDistTwoCows){
                cows++;
                lastCowStandIdx = i;
            }
        }
        
        return ( cows >= targetCows )?true : false;
    }
    
    public int aggressiveCows(int[] stalls, int targetCows) {
        // code here
        if(stalls.length < targetCows){
            return -1;
        }
        
        Arrays.sort(stalls);
        
        int minDist = 1;
        int maxDist = stalls[stalls.length-1] - stalls[0];
        
        int ans = -1;
        
        while(minDist <= maxDist){
            int mid = minDist + (maxDist - minDist)/2;
            
            if(isAllocationPossible(stalls, mid, targetCows)){
                ans = mid;
                minDist = mid + 1;
            }else{
                maxDist = mid - 1;
            }
        }
        
        return ans;
    }
}