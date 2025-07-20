class Solution {
    public int findFloor(int[] arr, int target) {
        // code here
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;  // returning last occurence
            }else if(arr[mid] < target){
                start = mid + 1;
                ans = mid;      // taking floor value as ans
            }else{
                end = mid - 1;
            }
        }
        
        return ans;
    }
}
