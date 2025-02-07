//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String s)
    {
        // code here
        StringBuilder str = new StringBuilder();
        
        int auxArr[] = new int[26];   //By default the frequency is zero
        
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            auxArr[curr - 'a']++;
        }
        
        for(int i=0; i<26; i++){
            while(auxArr[i] > 0){
                str.append((char)(i+'a'));
                auxArr[i]--;
            }
        }
        
        return str.toString();
    }
}