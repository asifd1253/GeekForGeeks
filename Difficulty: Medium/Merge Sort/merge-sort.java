class Solution {
    void merge(int arr[], int si, int mid, int ei){
        int i = si;
        int j = mid+1;
        
        int k = 0;      //temp iterator
        int temp[] = new int[ei-si+1];
        
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; k++;
            }else{
                temp[k] = arr[j];
                j++; k++;
            }
        }
        
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        
        for(int m=0; m<temp.length; m++){
            arr[si+m] = temp[m];
        }
    }

    void mergeSort(int arr[], int si, int ei) {
        // code here
        if(si >= ei){
            return;
        }
        
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        
        merge(arr, si, mid, ei);
    }
}
