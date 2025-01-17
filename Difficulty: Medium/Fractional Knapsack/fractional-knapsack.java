//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            // Read values array
            String[] valueInput = br.readLine().trim().split(" ");
            List<Integer> values = new ArrayList<>();
            for (String s : valueInput) {
                values.add(Integer.parseInt(s));
            }

            // Read weights array
            String[] weightInput = br.readLine().trim().split(" ");
            List<Integer> weights = new ArrayList<>();
            for (String s : weightInput) {
                weights.add(Integer.parseInt(s));
            }

            // Read the knapsack capacity
            int w = Integer.parseInt(br.readLine().trim());

            // Call fractionalKnapsack function and print result
            System.out.println(String.format(
                "%.6f", new Solution().fractionalKnapsack(values, weights, w)));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        // code here
        ArrayList<int[]> ratio = new ArrayList<>();
        
        for(int i=0; i<val.size(); i++){
            double rat = (double)val.get(i)/wt.get(i);
            ratio.add(new int[]{i,(int)(rat*100000)});
        }
        
        ratio.sort((a,b)-> b[1] - a[1]);
        
        double result = 0;
        for(int[] item : ratio){
            int index = item[0];
            
            if(capacity >= wt.get(index)){
                capacity -= wt.get(index);
                result = result + val.get(index);
            }else{
                result = result + ((double) val.get(index)/wt.get(index)) * capacity;
                break;
            }
        }
        
        return result;
    }
}