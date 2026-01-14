
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        int n = arr.length;
        // Your code here
        int breakPoint = -1;
        
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                breakPoint = i;
                break;
            }
        }
        
        if(breakPoint == -1) breakPoint = n-1;
        
        int left = (breakPoint + 1)%n;
        int right = breakPoint;
        
        while(left != right){
            int curSum = arr[left]+arr[right];
            if(curSum == target){
                return true;
            }else if(curSum < target){
                left = (left + 1)%n;
            }else{
                right = (n + right -1)%n;
            }
        }
        
        return false;
    }
}
