class Solution {
    boolean isValid(int arr[], int maxAllowPages, int totStu){
        int stu = 1;
        int curPages = 0;
        
        for(int pages : arr){
            if(pages > maxAllowPages) return false;
            
            if(curPages+pages <= maxAllowPages){
                curPages += pages;
            }else{
                stu++;
                curPages = pages;
            }
        }
        
        return stu <= totStu ? true:false;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length < k) return -1;
        
        int totalRange = 0;
        
        for(int i : arr) totalRange += i;
        
        int st = 0;
        int end = totalRange;
        
        int ans = Integer.MAX_VALUE;
        
        while(st <= end){
            int mid = st + (end-st)/2;
            
            if(isValid(arr, mid, k)){
                ans = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        
        return ans;
    }
}
