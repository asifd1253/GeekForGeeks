class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0; i<arr.length-1; i++){
            int minIdx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}