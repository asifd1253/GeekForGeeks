class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    
    void swap(int arr[], int curEle, int idx){
        int temp = arr[curEle];
        arr[curEle] = arr[idx];
        arr[idx] = temp;
    }
    
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        int left = 0;
        int right = arr.length-1;
        
        int i=0; 
        
        while(i <= right){
            if(arr[i] < a){
                swap(arr, left, i);
                left++;
                i++;
            }else if(arr[i] > b) {
                swap(arr, right, i);
                right--;
            }else{
                i++;
            }
        }
    }
}