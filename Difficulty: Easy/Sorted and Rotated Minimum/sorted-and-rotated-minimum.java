// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        
        int start = 0;
        int end = arr.length-1;
        int minEle = Integer.MAX_VALUE;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[start] <= arr[mid]){
                minEle = Math.min(minEle, arr[start]);
                start = mid + 1;
            }else{
                minEle = Math.min(minEle, arr[mid]);
                end = mid - 1;
            }
        }
        
        return minEle;
    }
}
