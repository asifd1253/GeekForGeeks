class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int st = 0;
        int end = arr.length-1;
        
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            
            st++;
            end--;
        }
        
    }
}