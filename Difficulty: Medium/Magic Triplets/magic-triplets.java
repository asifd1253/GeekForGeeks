//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int ans = ob.countTriplets(nums);
            System.out.println(ans);         
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public int countTriplets(int[] arr){
        // code here
        int count = 0;
        int n = arr.length;
        int leftSmall[] = new int[n];
        int rightGreat[] = new int[n];
        
        for(int i=0; i<n; i++){
            int curr = arr[i];
            for(int j=0; j<i; j++){
                if(arr[j] < curr){
                    leftSmall[i]++;
                }
            }
            for(int j=i; j<n; j++){
                if(arr[j] > curr){
                    rightGreat[i]++;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            count += leftSmall[i]*rightGreat[i];
        }
        
        return count;
    }
}