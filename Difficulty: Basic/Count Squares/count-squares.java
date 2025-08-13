// User function Template for Java

class Solution {
    static int countSquares(int n) {
        
        // int count = 0;
        // for(int i=1; i*i<n; i++){
        //     count++;
        // }
        // return count;
        int start = 1;
        int end = n; 
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (mid <= (n - 1) / mid) { // equivalent to mid*mid < n
                ans = mid;
                start = mid + 1;  // move right to find larger candidate
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
