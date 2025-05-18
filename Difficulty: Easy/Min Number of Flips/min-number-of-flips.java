//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution ob = new Solution();
            
            System.out.println(ob.minFlips(S));
                        
        }
	}
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public int minFlips(String S) {
        // Code here
        int flip1 = 0;
        int flip2 = 0;
        
        for(int i=0; i<S.length(); i++){
            char expected1 = (i%2 == 0) ? '0' : '1';
            char expected2 = (i%2 == 0) ? '1' : '0';
            
            if(expected1 != S.charAt(i)){
                flip1++;
            }
            if(expected2 != S.charAt(i)){
                flip2++;
            }
        }
        
        return Math.min(flip1, flip2);
    }
}