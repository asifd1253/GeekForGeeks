// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int st = 0;
        int end = arr.length-1;
        
        int ans = -1;
        
        while(st < end){
            int mid = st + (end - st)/2;
            
            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                ans = arr[mid];
                break;
            }else if(arr[mid] < arr[mid+1]){
                ans = arr[mid+1];
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        
        return ans;
    }
}