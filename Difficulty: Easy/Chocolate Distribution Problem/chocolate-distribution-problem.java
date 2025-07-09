// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int res = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.size() - m+1; i++){
            int minEle = arr.get(i);
            int maxEle = arr.get(i + m-1);
            
            res = Math.min(res, maxEle - minEle);
        }
        
        return res;
    }
}