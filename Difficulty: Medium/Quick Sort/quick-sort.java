class Solution {
    public void quickSort(int[] arr, int si, int ei) {
        // code here
        if(si >= ei) return;
        
        int pivotIdx = partition(arr, si, ei);
        quickSort(arr, si, pivotIdx-1);
        quickSort(arr, pivotIdx+1, ei);
        
    }

    private int partition(int[] arr, int si, int ei) {
        // code here
        int pivot = arr[ei];
        int i = si - 1;
        
        for(int j=si; j<ei; j++){
            if(arr[j] < pivot){
                i++;
                
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        
        i++;
        
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        
        return i;
    }
}