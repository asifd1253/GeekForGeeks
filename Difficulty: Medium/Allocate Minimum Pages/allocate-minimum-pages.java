class Solution {
    boolean isValid(int arr[], int mid, int M){
        int students = 1;
        int pages = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > mid){     //Edge case
                return false;
            }
            
            if(arr[i] + pages <= mid){
                pages += arr[i];
            }else{
                students++;
                pages = arr[i];
            }
        }
        
        return students <= M ?true:false;
    }
    
    public int findPages(int[] arr, int M) {
        // code here
        if(arr.length < M){
            return -1;
        }
        
        int range = 0;
        for(int i : arr){
            range += i;
        }
        
        int start = 0;
        int end = range;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(isValid(arr, mid, M)){
                ans = mid;
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        
        return ans;
        
    }
}