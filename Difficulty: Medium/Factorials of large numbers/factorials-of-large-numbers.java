//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    
    public static void multiply(int mul, int temp[]){
        int carry = 0;
        for(int i=0; i<size; i++)    {
            int result = mul * temp[i];
            result = result + carry;
            temp[i] = result % 10;  //store the last digit
            carry = result / 10;   //remain in carry
            
        }
        
        while(carry > 0){
            temp[size] = carry % 10;
            size++;
            carry = carry / 10;
        }
       
    }
    static int size;
    public static ArrayList<Integer> factorial(int n) {
        // code here
        size = 1;
        int temp[] = new int[10000];
        temp[0] = 1;
        
     
        for(int mul=2; mul<=n; mul++){
            multiply(mul, temp);
        }
        
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=size-1; i>=0; i--){
            result.add(temp[i]);
        }
        
        return result;
    }
}


//{ Driver Code Starts.

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends