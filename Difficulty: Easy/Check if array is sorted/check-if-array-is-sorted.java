class Solution {
    boolean checker(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        
        if(arr[idx] > arr[idx+1]){
            return false;
        }
        
        return checker(arr, idx+1);
    }
    public boolean isSorted(int[] arr) {
        // code here
        return checker(arr, 0);
    }
}