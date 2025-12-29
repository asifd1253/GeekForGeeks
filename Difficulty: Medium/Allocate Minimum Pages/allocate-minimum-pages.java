class Solution {
    boolean isValidRange(int arr[], int maxAllowPages, int k){
        int students = 1;
        int curPages = 0;
        
        for(int pages : arr){
            if(pages > maxAllowPages) return false;
            
            if(pages + curPages <= maxAllowPages){
                curPages += pages;
            }else{
                students++;
                curPages = pages;
            }
        }
        
        return (students<=k)?true:false;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length < k) return -1;
        
        int pagesRange = 0;
        for(int i : arr) pagesRange += i;
        
        int st = 0;
        int end = pagesRange;
        
        int ans = 0;
        
        while(st <= end){
            int mid = st + (end-st)/2;
            
            if(isValidRange(arr, mid, k)){
                ans = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        
        return ans;
    }
}
