class Solution {
    
    void heapify(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;
        
        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }
        
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }
        
        if(maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            
            heapify(arr, maxIdx, size);
        }
        
    }
    // Function to sort an array using Heap Sort.
    public void heapSort(int arr[]) {
        // code here
        int n = arr.length;
        
        //step-1 Build MaxHeap
        for(int i=n/2; i>=0; i--){
            heapify(arr, i, n);
        }
        
        //step-2 push largest at end
        for(int i=n-1; i>0; i--){
            //swap (largest-first with last)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapify(arr, 0, i);
        }
        
    }
}