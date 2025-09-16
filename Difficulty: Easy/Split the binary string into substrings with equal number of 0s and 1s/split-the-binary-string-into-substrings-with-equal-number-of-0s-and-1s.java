//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    
    public static int maxSubStr(String str) {
        // Write your code here
        int count0 = 0;
        int count1 = 0;
        int ans = 0;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '0'){
                count0++;
            }else{
                count1++;
            }
            
            if(count0 == count1){
                ans++;
            }
        }
        
        if(count0 != count1){
            return -1;
        }
        
        return ans;
    }
}

