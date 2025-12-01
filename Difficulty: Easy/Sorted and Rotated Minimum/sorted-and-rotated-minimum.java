// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int st = 0;
        int end = arr.length-1;
        int minEle = Integer.MAX_VALUE;
        
        while(st <= end){
            int mid = st + (end - st)/2;
            
            if(arr[st] <= arr[mid]){
                minEle = Math.min(minEle, arr[st]);
                st = mid + 1;
            }else{
                minEle = Math.min(minEle, arr[mid]);
                end = mid-1;
            }
        }
        
        return minEle;
    }
}
