class Solution {
    public int startStation(int[] gas, int[] cost) {
        // code here
        int n = gas.length;
        
        int total = 0;
        int curr = 0;
        int startIdx = 0;
        
        for(int i=0; i<n; i++){
            int diff = gas[i] - cost[i];
            
            total += diff;
            curr += diff;
            
            if(curr < 0){
                startIdx = i+1;
                curr = 0;
            }
        }
        
        return (total >= 0)?startIdx:-1;
    }
}