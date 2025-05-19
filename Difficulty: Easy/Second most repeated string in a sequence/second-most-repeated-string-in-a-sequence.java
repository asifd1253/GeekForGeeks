//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String secFrequent(String arr[], int N) {
        // your code here
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<N; i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
        }
        
        int freq1 = 0;
        int freq2 = 0;
        
        String str1 = "";
        String str2 = "";
        
        for(String word : map.keySet()){
            int currfreq = map.get(word);
            
            if(freq1 < currfreq){
                freq2 = freq1;
                str2 = str1;
                
                freq1 = currfreq;
                str1 = word;
            }else if(freq1 > currfreq && freq2 < currfreq){
                freq2 = currfreq;
                str2 = word;
            }
        }
        
        return str2;
        
    }
}