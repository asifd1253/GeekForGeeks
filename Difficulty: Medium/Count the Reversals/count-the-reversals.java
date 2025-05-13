//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

class Solution {
    public int countMinReversals(String s) {
        // code here
        if(s.length()%2 != 0){
            return -1;
        }
        
        int left = 0;
        int right = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '{'){
                left++;
            }else{
                if(left > 0){
                    left--;
                }else{
                    right++;
                }
            }
        }
        
        int leftReversal = (left+1)/2;
        int rightReversal = (right+1)/2;
       
        return leftReversal + rightReversal;
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(sol.countMinReversals(s));
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends