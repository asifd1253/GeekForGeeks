class Solution {
    void selectionSort(int[] arr) {
        // code here
        // find min position from i+1 and swap with i
        
        for(int i=0; i<arr.length-1; i++){
            int minIdx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            
        }
        
    }
}
