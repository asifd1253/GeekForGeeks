class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length-1;
        
        boolean res = false;
        while(left < right){
            if(arr[left] + arr[right] == target){
                res = true;
                left++;
                right--;
            }else if(arr[left] + arr[right] < target){
                left++;
            }else{
                right--;
            }
        }
        
        return res;
    }
}