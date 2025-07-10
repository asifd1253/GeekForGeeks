//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.minSwap(a, k);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        int n = arr.length;
        
        int windowSize = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= k){
                windowSize++;
            }
        }
        
        int badcount = 0;
        for(int i=0; i<windowSize; i++){
            if(arr[i] > k){
                badcount++;
            }
        }
        
        int start = 0;
        int end = windowSize;
        int minswap = badcount;
        
        while(end < n){
            if(arr[end] > k){
                badcount++;
            }
            
            if(arr[start] > k){
                badcount--;
            }
            
            minswap = Math.min(minswap, badcount);
            
            start++;
            end++;
        }
        
        return minswap;
    }
}
