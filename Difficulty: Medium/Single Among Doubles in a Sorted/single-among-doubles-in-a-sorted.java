class Solution {
    int single(int[] arr) {
        int n = arr.length;
        // code here
        int st = 0;
        int end = n-1;
        
        while(st <= end){
            int mid = st + (end-st)/2;
            
            if(mid == 0 || mid == n-1) return arr[mid];
            
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];
            
            if(mid%2 == 0){
                if(arr[mid] == arr[mid-1]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else{
                if(arr[mid] == arr[mid-1]){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        
        return -1;
    }
}
