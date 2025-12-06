class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int st = 0;
        int end = arr.length-1;
        
        int ans = -1;
        
        while(st <= end){
            int mid = st + (end - st)/2;
            
            if(arr[mid] == x){
                ans = mid;
                st = mid+1;         //taking floor value that's why
            }else if(arr[mid] < x){ //Go right side
                st = mid+1;
                ans = mid;          //suppose last value
            }else{                  //Go left side
                end = mid - 1;
            }
        }
        
        return ans;
    }
}
