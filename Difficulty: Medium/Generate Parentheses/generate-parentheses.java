//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> dp[] = new List[n+1];
        dp[0] = Arrays.asList("");
        dp[1] = Arrays.asList("()");
        
        for(int i=2; i<=n; i++){
            dp[i] = new ArrayList<>();
            
            int inner = i-1;
            int outer = 0;
            
            while(inner >=0 && outer <= i-1){
                for(String in : dp[inner]){
                    for(String out : dp[outer]){
                        StringBuilder sb = new StringBuilder();
                        sb.append("(");
                        sb.append(in);
                        sb.append(")");
                        sb.append(out);
                        dp[i].add(sb.toString());
                    }
                }
                
                
                inner--;
                outer++;
            }
        }
        
        return dp[n];
        
    }
}