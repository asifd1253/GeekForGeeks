class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
            
        for(int j=n-2; j>=0; j--){
            rightMax[j] = Math.max(arr[j], rightMax[j+1]);
        }
        
        int trappedWater = 0;
        
        for(int k=0; k<n; k++){
            int waterLevel = Math.min(leftMax[k], rightMax[k]);
            
            trappedWater = trappedWater + (waterLevel-arr[k])*1;
        }
        
        
        return trappedWater;
    }
}
