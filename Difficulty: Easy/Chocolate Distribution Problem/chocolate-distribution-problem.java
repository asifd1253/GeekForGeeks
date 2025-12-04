// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int k) {
        // your code here
        Collections.sort(arr);
        
        int res = Integer.MAX_VALUE;
        
        int n = arr.size();
        for(int i=0; i<n-k+1; i++){
            int min = arr.get(i);
            int max = arr.get(i+k-1);
            
            res = Math.min(res, (max-min));
        }
        
        return res;
    }
}