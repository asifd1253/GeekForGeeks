class Solution {
    public static int mcm(int arr[], int i, int j){
        if(i == j){
            return 0;
        }
        
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k+1, j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        
        return ans;
    }
    static int matrixMultiplication(int arr[]) {
        // code here
        return mcm(arr, 1, arr.length-1);
        
    }
}
