//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // Read first array
            String input = br.readLine();
            String[] inputArray = input.split(" ");
            int[] arr = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            int res = ob.longestConsecutive(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int num : arr){
            map.put(num, false);
        }
        
        int longestLength = 0;
        
        for(int num : arr){
            int currLength = 1;
            
            int nextNum = num+1;
            while(map.containsKey(nextNum) && map.get(nextNum) == false){
                currLength++;
                map.put(nextNum, true);
                nextNum++;
            }
            
            int prevNum = num-1;
            while(map.containsKey(prevNum) && map.get(prevNum) == false){
                currLength++;
                map.put(prevNum, true);
                prevNum--;
            }
            
            longestLength = Math.max(longestLength, currLength);
        }
        
        
        return longestLength;
    }
} 