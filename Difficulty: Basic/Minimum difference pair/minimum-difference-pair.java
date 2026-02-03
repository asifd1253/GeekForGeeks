// User function Template for Java

class Solution {
    public int minimumDifference(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        int res = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length-1; i++){
            int j = i+1;
            
            int diff = arr[j] - arr[i];
            if(diff < res){
                res = diff;
            }
        }
        
        return res;
    }
}