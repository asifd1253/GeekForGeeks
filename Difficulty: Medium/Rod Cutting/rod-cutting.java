//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int[] arr = new int[s.length];
            for (int i = 0; i < s.length; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr));

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public int cutRod(int[] price) {
        // code here
        int length[] = new int[price.length];
        
        for(int i=0; i<length.length; i++){
            length[i] = i+1;
        }
        
        int dp[][] = new int[price.length+1][length.length+1];
        for(int r=0; r<dp.length; r++){
            dp[r][0] = 0;
        }
        
        for(int c=0; c<dp[0].length; c++){
            dp[0][c] = 0;
        }
        
        for(int i=1; i<=price.length; i++){
            for(int j=1; j<=length.length; j++){
                if(length[i-1] <= j){
                    dp[i][j] = Math.max(price[i-1]+dp[i][j-length[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[length.length][price.length];
        
    }
}