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
        int n = arr.length;
        int windowStart = 0;
        int windowEnd = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        
        while(windowEnd < n){
            //expansion
            sum += arr[windowEnd];
            if(sum > x){
                minLen = Math.min(minLen, windowEnd-windowStart+1);
                //shrinking
                while(windowStart < windowEnd && sum > x){
                    sum -= arr[windowStart];
                    windowStart++;
                    if(sum > x){
                        minLen = Math.min(minLen, windowEnd-windowStart+1);
                    }
                }
            }
            windowEnd++;
        }
        
        return (minLen == Integer.MAX_VALUE)?0:minLen;
    }
}
