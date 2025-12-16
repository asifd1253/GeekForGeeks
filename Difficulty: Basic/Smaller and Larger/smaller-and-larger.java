// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int res[] = new int[2];
        
        int lessCount = 0;
        int greatCount = 0;
        
        for(int i : arr){
            if(i <= target){
                lessCount++;
            }
            if(i >= target){
                greatCount++;
            }
        }
        
        res[0] = lessCount;
        res[1] = greatCount;
        
        return res;
        
    }
}