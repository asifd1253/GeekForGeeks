class Solution {
    int maxProduct(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int product = 1;
        
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
            
            max = Math.max(max, product);
            
            if(product == 0){
                product = 1;
            }
        }
        
        product = 1;
        for(int i=arr.length-1; i>=0; i--){
            product *= arr[i];
            
            max = Math.max(max, product);
            
            if(product == 0){
                product = 1;
            }
        }
        
        return max;
    }
}