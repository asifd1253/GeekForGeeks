// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int lessEle = 0;
        int greatEle = 0;
        int result[] = new int[2];
        
        for(int i : arr){
            if(i <= target){
                lessEle++;
            }
            if(i >= target){
                greatEle++;
            }
        }
        
        result[0] = lessEle;
        result[1] = greatEle;
        
        return result;
    }
}