//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends

// User function Template for Java

class Solution {

    public int minDifference(int arr[]) {
        // Your code goes here
        int n = arr.length;
        int totalSum = 0;
        for(int i=0; i<n; i++){
            totalSum += arr[i];
        }
        
        int targetSum = totalSum/2;
        int dp[][] = new int[n+1][targetSum+1];
        
        for(int i=1; i<n+1; i++){
            for(int j=1; j<targetSum+1; j++){
                int wt = arr[i-1];
                
                if(wt <= j){
                    dp[i][j] = Math.max(dp[i-1][j-wt] + arr[i-1], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        int sum1 = dp[n][targetSum];
        int sum2 = totalSum - sum1;
        
        return Math.abs(sum1 - sum2);
    }
}



//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            // int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int ans = ob.minDifference(arr);

            System.out.print(ans);

            System.out.println(); // New line after printing the results
        }
    }
}

// } Driver Code Ends