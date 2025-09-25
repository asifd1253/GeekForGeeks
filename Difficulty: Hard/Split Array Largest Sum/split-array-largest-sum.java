class Solution {
    boolean check(int mid, int arr[], int k){
        int count = 1, sum = 0;
        for (int num : arr) {
            if (sum + num > mid) {
                count++;
                sum = num;
                if (count > k) return false;
            } else {
                sum += num;
            }
        }
        return true;
    }
    public int splitArray(int[] arr, int k) {
        // code here
        int start = 0;
        int end = 0;
        for(int i : arr){
            start = Math.max(start, i);
            end += i;
        }
        
        int res = 0;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(check(mid, arr, k)){
                res = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        return res;
    }
};