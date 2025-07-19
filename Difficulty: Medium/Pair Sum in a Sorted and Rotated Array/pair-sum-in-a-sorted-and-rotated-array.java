
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        int n = arr.length;
        int breakPoint = -1;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                breakPoint = i;
                break;
            }
        }
        
        if(breakPoint == -1){
            breakPoint = n-1;
        }
        
        int left = (breakPoint+1)%n;
        int right = breakPoint;
        
        while(left != right){
            if(arr[left] + arr[right] == target){
                return true;
            }else if(arr[left] + arr[right] < target){
                left = (left + 1)%n;
            }else{
                right = (n + right -1)%n;
            }
        }
        
        return false;
    }
}
