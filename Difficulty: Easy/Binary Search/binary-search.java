class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int st = 0;
        int end = arr.length-1;
        
        int smallIdx = -1;
        
        while(st <= end){
            int mid = st + (end - st)/2;
            
            if(arr[mid] == k){
                smallIdx = mid;
                end = mid-1;
            }else{
                if(arr[mid] > k){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }
        }
        
        return smallIdx;
    }
}