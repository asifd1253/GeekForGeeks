//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T > 0) {
            int x = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            Solution solution = new Solution();
            System.out.println(solution.smallestSubWithSum(x, arr));

            T--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int start = 0;
        int curSum = 0;
        int minLen = Integer.MAX_VALUE;
        
        for(int end=0; end<arr.length; end++){
            curSum = curSum + arr[end];
            
            while(curSum > x){     //This will run when curSum > x(target) --> true
                minLen = Math.min(minLen, end - start +1);
                curSum = curSum - arr[start];
                start++;
            }
        }
        
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
