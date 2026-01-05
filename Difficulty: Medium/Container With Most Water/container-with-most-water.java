class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int lp = 0;
        int rp = arr.length-1;
        
        int maxWater = 0;
        
        while(lp < rp){
            int width = rp - lp;
            int height = Math.min(arr[lp], arr[rp]);
            
            int curWater = width * height;
            
            maxWater = Math.max(maxWater, curWater);
            
            if(arr[lp] < arr[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        
        return maxWater;
    }
}