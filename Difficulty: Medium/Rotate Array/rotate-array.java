class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        for(int i=0; i<d; i++){
            int temp = arr[0];
            for(int j=1; j<arr.length; j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
    }
}