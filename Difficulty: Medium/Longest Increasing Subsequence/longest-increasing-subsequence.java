//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine())
                               .trim()
                               .split(" "); // Read the input for the current test case
            int arr[] = new int[str.length];
            // Convert input string into an integer array
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            // Call the solution method and print the result
            System.out.println(new Solution().lis(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    public static int lcs(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];
        
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = 0;
        }
        
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        
        return dp[n][m];
    }
    
    // Function to find length of longest increasing subsequence.
    static int lis(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        
        int arr2[] = new int[set.size()];
        int i = 0;
        for(int num : set){
            arr2[i] = num;
            i++;
        }
        
        Arrays.sort(arr2);
        return lcs(arr, arr2);
    }
}