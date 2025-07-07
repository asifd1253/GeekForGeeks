// User function Template for Java

class Solution {
    static int merge(int arr[], int left, int mid, int right){
        int leftArr[] = new int[mid - left +1];
        int rightArr[] = new int[right - mid];
        
        for(int i=0; i<leftArr.length; i++){
            leftArr[i] = arr[left + i];
        }
        for(int i=0; i<rightArr.length; i++){
            rightArr[i] = arr[mid+1 + i];
        }
        
        int i=0, j=0, k=left, invCount = 0;
        
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            }else{
                arr[k++] = rightArr[j++];
                invCount += (leftArr.length - i);
            }
        }
        
        while(i < leftArr.length){
            arr[k++] = leftArr[i++];
        }
        while(j < rightArr.length){
            arr[k++] = rightArr[j++];
        }
        
        return invCount;
    }
    static int mergeSort(int arr[], int left, int right){
        int count = 0;
        if(left < right){
            int mid = left + (right - left)/2;
            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid+1, right);
            count += merge(arr, left, mid, right);
        }
        return count;
    }
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergeSort(arr, 0, arr.length-1);
    }
}