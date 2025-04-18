//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String arr1[] = br.readLine().split(" ");
            int[] a = new int[arr1.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(arr1[i]);

            String arr2[] = br.readLine().split(" ");
            int[] b = new int[arr2.length];

            for (int i = 0; i < arr2.length; i++) b[i] = Integer.parseInt(arr2[i]);

            if (b.length == 1 && b[0] == 0) {
                b = new int[0];
            }
            double res = new Solution().medianOf2(a, b);

            if (res == (int)res)
                System.out.println((int)res);
            else
                System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        int m = a.length;
        int n = b.length;
        
        int temp[] = new int[m+n];
        
        int i=0, j=0, k=0;
        while(i < m && j < n){
            if(a[i] < b[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = b[j++];
            }
        }
        
        while(i < m){
            temp[k++] = a[i++];
        }
        
        while(j < n){
            temp[k++] = b[j++];
        }
        
        int size = m+n;
        
        if(size%2 != 0){
            return temp[size/2];
        }
        
        return (temp[size/2] + temp[(size/2)-1])/2.0;
        
    }
}