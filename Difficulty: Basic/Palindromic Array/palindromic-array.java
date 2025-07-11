//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = (int)i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.isPalinArray(arr) ? "true" : "false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        
        for(int i : arr){
            String curStr = String.valueOf(i);
            
            int left = 0;
            int right = curStr.length()-1;
            
            while(left <= right){
                if(curStr.charAt(left) != curStr.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
        }
        
        return true;
    }
}