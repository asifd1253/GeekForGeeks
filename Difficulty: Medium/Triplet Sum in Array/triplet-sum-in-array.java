// User function Template for Java

class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean hasTripletSum(int arr[], int target) {
        // Your code Here
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            int left = i+1;
            int right = arr.length-1;
            
            while(left < right){
                if(arr[i] + arr[left] + arr[right] == target){
                    return true;
                }else if(arr[i] + arr[left] + arr[right] < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        
        return false;
    }
}
