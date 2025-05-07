//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();

            System.out.println(ob.countAndSay(n));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String countAndSay(int n) {
        // code here
        if(n == 1){
            return "1";
        }
        
        String s = countAndSay(n-1);
        
        int counter = 0;
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            counter++;
            if(i == s.length()-1 || s.charAt(i) != s.charAt(i+1)){
                res.append(counter);
                res.append(s.charAt(i));
                counter = 0;
            }
        }
        
        return res.toString();
    }
}
