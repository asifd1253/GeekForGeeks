//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int i = sc.nextInt();

            Solution obj = new Solution();
            obj.bitManipulation(n, i);
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        // get ith bit
        int bitMask = 1<<(i-1);
        int getBit = (num & bitMask) == 0 ? 0:1;
        
        // set ith bit
        int setBit = num | bitMask;
        
        // clear ith bit
        int clearBitMask = ~bitMask;
        int clearBit = num & clearBitMask;
        
        // print the answer
        System.out.print(getBit+" "+setBit+" "+clearBit);
    }
}
