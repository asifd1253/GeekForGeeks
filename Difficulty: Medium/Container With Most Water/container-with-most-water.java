// User function Template for Java

class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        // int maxWater = 0;
        
        // for(int i=0; i<arr.length; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //         int height = Math.min(arr[i], arr[j]);
        //         int width = j - i;
        //         int waterStored = (height * width);
                
        //         maxWater = Math.max(maxWater, waterStored);
        //     }
        // }
        
        // return maxWater;
        
        int lp = 0;
        int rp = arr.length-1;
        
        int maxWater = 0;
        
        while(lp < rp){
            int height = Math.min(arr[lp], arr[rp]);
            int width = rp - lp;
            int currWater = height * width;
            
            maxWater = Math.max(currWater, maxWater);
            
            if(arr[lp] < arr[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        
        return maxWater;
    }
}