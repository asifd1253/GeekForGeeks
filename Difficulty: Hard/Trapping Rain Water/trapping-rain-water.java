class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        
        leftMax[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        
        int trappedWater = 0;
        for(int i=0; i<arr.length; i++){
            
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            
            trappedWater += waterLevel - arr[i] * 1;
        }
        
        return trappedWater;
    }
}
