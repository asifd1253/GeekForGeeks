//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int result = 0;
        
        for(int i=0; i<s.length(); i++){
            int curr = map.get(s.charAt(i));
            
            if(i+1 < s.length()){
                int next = map.get(s.charAt(i+1));
                
                if(curr < next){
                    result -= curr;
                }else{
                    result += curr;
                }
            }else{
                result += curr;
            }
        }
        
        return result;
    }
}