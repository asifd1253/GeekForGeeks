//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    void reverse(int arr[], int left, int right){
        while(left < right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }
    
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        
        int golaIndex = -1;
        
        for(int i=n-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                golaIndex = i;
                break;
            }
        }
        
        if(golaIndex != -1){
            int swapIndex = golaIndex;
        
            for(int j=n-1; j>golaIndex; j--){
                if(arr[golaIndex] < arr[j]){
                    swapIndex = j;
                    break;
                }
            }
            
            swap(arr, golaIndex, swapIndex);
        }
        
        
        reverse(arr, golaIndex+1, arr.length-1);
    }
}


//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends