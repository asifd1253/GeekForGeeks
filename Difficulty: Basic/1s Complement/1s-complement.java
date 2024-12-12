//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine();
          

            Solution ob = new Solution();
            System.out.println(ob.onesComplement(S,N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String onesComplement(String S,int N){
        //code here
        StringBuilder str = new StringBuilder();
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == '0'){
                str.append('1');
            }else{
                str.append('0');
            }
        }
        
        return str.toString();
    }
}