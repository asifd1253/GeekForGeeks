//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> posNum = new ArrayList<>();
        ArrayList<Integer> negNum = new ArrayList<>();
        
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) >= 0){
                posNum.add(arr.get(i));
            }else{
                negNum.add(arr.get(i));
            }
        }
        
        int i=0, j=0, k=0;
        while(i < posNum.size() && j < negNum.size()){
            arr.set(k, posNum.get(i));
            i++;
            k++;
            
            arr.set(k, negNum.get(j));
            j++;
            k++;
        }
        
        while(i < posNum.size()){
            arr.set(k, posNum.get(i));
            i++;
            k++;
        }
        
        while(j < negNum.size()){
            arr.set(k, negNum.get(j));
            j++;
            k++;
        }
    }
}