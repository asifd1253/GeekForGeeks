class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int zero = 0;
        int one = 0;
        int two = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }else if(arr[i] == 1){
                one++;
            }else{
                two++;
            }
        }
        
        int idx = 0;
        
        for(int j=0; j<zero; j++){
            arr[idx++]  = 0;
        }
        
        for(int k=0; k<one; k++){
            arr[idx++] = 1;
        }
        
        for(int m=0; m<two; m++){
            arr[idx++] = 2;
        }
    }
}