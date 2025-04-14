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
        int fav = 0;
        int nonFav = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i] <= k){
                fav++;
            }
        }
        
        for(int j=0; j<fav; j++){
            if(arr[j] > k){
                nonFav++;
            }
        }
        
        int l=0, r=fav-1, result = Integer.MAX_VALUE;
        
        while(r < n){
            result = Math.min(result, nonFav);
            r++;
            if(r < n && arr[r] > k) {
                nonFav++;
            }
            if(l < n && arr[l] > k) {
                nonFav--;
            }
        }
        
        return (result == Integer.MAX_VALUE)?0:result;
    }
}
