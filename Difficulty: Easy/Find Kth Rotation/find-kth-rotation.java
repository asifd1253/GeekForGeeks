class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int st = 0;
        int end = arr.length-1;
        
        int minEle = Integer.MAX_VALUE;
        int minIdx = Integer.MAX_VALUE;
        
        while(st <= end){
            int mid = st + (end - st)/2;
            
            if(arr[st] <= arr[mid]){
                if(arr[st] < minEle){
                    minEle = arr[st];
                    minIdx = st;
                }
                st = mid + 1;
            }else{
                if(arr[mid] < minEle){
                    minEle = arr[mid];
                    minIdx = mid;
                }
                end = mid - 1;
            }
        }
        
        return minIdx;
    }
}