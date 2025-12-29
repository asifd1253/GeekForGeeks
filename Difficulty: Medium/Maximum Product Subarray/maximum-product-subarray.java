class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        
        int leftProd = 1;
        int rightProd = 1;
        
        int ans = arr[0];
        
        for(int i=0; i<n; i++){
            leftProd = (leftProd == 0)?1:leftProd;
            rightProd = (rightProd == 0)?1:rightProd;
            
            leftProd *= arr[i];
            rightProd *= arr[n-1-i];
            
            ans = Math.max(ans, Math.max(leftProd, rightProd));
        }
        
        return ans;
    }
}