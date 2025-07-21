// User function Template for Java

class Solution {
    public int minimumDifference(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            min = Math.min(arr[i+1] - arr[i], min);
        }
        
        return min;
    }
}