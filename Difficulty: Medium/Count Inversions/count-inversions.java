//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    static int merge(int arr[], int st, int mid, int end){
        int invCount = 0;
        int i=st;
        int j=mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        
        while(i<=mid && j<=end){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                invCount += mid-i+1;
                temp.add(arr[j]);
                j++;
            }
        }
        
        while(i <= mid){
            temp.add(arr[i]);
            i++;
        }
        while(j <= end){
            temp.add(arr[j]);
            j++;
        }
        
        for(int k=st; k<=end; k++){
            arr[k] = temp.get(k-st);
        }
        
        return invCount;
    }
    static int mergeSort(int arr[], int st, int end){
        if(st < end){
            int mid = st + (end - st)/2;
            
            int leftInvCount = mergeSort(arr, st, mid);
            int rightInvCount = mergeSort(arr, mid+1, end);
            
            int invCount = merge(arr, st, mid, end);
            
            return leftInvCount + rightInvCount + invCount;
            
        }
        
        return 0;
    }
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        int st = 0;
        int end = arr.length-1;
        
        return mergeSort(arr, st, end);
    }
}