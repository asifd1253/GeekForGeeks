class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        for(int i=0; i<arr.length; i=i+k){
            int left = i;
            int right = Math.min((i-1)+k, n-1);
            
            while(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
        }
        
    }
}