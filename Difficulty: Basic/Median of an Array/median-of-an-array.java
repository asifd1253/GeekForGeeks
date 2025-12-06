class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        
        int n = arr.length;
        
        if(n%2 == 0){
            double ans = (arr[n/2] + arr[n/2 - 1])/2.0;
            return ans;
        }else{
            return (double)arr[n/2];
        }
    }
}
