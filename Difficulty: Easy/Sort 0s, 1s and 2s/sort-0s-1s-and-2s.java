//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int zero = 0;
        int one = 0;
        int two = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }else if(arr[i] == 1){
                one++;
            }else{
                two++;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(zero != 0){
                arr[i] = 0;
                zero--;
            }else if (one != 0){
                arr[i] = 1;
                one--;
            }else{
                arr[i] = 2;
                two--;
            }
        }
    }
}

//{ Driver Code Starts.
// } Driver Code Ends