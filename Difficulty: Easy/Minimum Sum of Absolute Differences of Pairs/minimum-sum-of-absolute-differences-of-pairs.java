// User function Template for Java

class Solution {
    long findMinSum(int[] A, int[] B, int N) {
        long minSum = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<N; i++){
            minSum += Math.abs(A[i] - B[i]);
        }
        
        return minSum;
    }
}