//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int low = 0;
        int high = arr.length-1;
        
        int count = 0;
        while (low < high) {
            int sum = arr[low] + arr[high];
        
            if (sum == target) {
               int ele1 = arr[low], ele2 = arr[high], cnt1 = 0, cnt2 = 0;
               while(low <= high && arr[low] == ele1){
                   low++;
                   cnt1++;
               }
               while(low <= high && arr[high] == ele2){
                   high--;
                   cnt2++;
               }
               if(ele1 == ele2){
                   count += (cnt1*(cnt1 - 1))/2;
               }else{
                    count += cnt1*cnt2;
               }
            } else if (sum < target) {
                low++; // Move left pointer to increase the sum
            } else {
                high--; // Move right pointer to decrease the sum
            }
        }
        
        return count;
    }
}


//{ Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution obj = new Solution();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends