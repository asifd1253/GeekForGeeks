//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int leftProduct = 1;
        int rightProduct = 1;
        
        int res = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            leftProduct *= arr[i];
            rightProduct *= arr[n-1-i];
            
            res = Math.max(res, Math.max(leftProduct, rightProduct));
            
            if(leftProduct == 0){
                leftProduct = 1;
            }
            if(rightProduct == 0){
                rightProduct = 1;
            }
            
        }
        
        return res;
    }
}