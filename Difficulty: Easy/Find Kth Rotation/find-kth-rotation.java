class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int start = 0;
        int end = arr.length - 1;
        int minEle = Integer.MAX_VALUE;
        int minIdx = Integer.MAX_VALUE;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[start] <= arr[mid]){
                if(arr[start] < minEle){
                    minEle = arr[start];
                    minIdx = start;
                }
                start = mid + 1;
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