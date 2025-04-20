//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int R = Integer.parseInt(read.readLine());
            int C = Integer.parseInt(read.readLine());
            int matrix[][] = new int[R][C];
            int c = 0;
            for (int i = 0; i < R; i++) {
                String line[] = read.readLine().trim().split(" ");
                for (int j = 0; j < C; j++) {
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findSmallerElements(int mat[][], int assumedMedian){
        int noOfSmallerEle = 0;
        for(int i=0; i<mat.length; i++){
            int start = 0;
            int end = mat[i].length-1;
            
            while(start <= end){
                int mid = start + (end - start)/2;
                if(mat[i][mid] <= assumedMedian){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            
            noOfSmallerEle += start;
        }
        
        return noOfSmallerEle;
    }
    int median(int mat[][]) {
        // code here
        int R = mat.length;
        int C = mat[0].length;
        
        int N = R*C;
        int medianIndex = N/2;
        int start = 1;
        int end = 2000;
        
        while(start <= end){
            int assumedMedian = start + (end - start)/2;
            int lesserElements = findSmallerElements(mat, assumedMedian);
            if(lesserElements <= medianIndex){
                start = assumedMedian + 1;
            }else{
                end = assumedMedian - 1;
            }
        }
        
        return start;
    }
    
}