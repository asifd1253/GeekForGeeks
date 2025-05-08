//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            ArrayList<String> ans = obj.findPermutation(S);
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public ArrayList<String> backtrack(char arr[], StringBuilder sb, boolean used[], ArrayList<String> res){
        //base case
        if(arr.length == sb.length()){
            res.add(sb.toString());
            return res;
        }
        
        //work
        for(int i=0; i<arr.length; i++){
            if(used[i]){
                continue;
            }
            
            if(i >0 && arr[i] == arr[i-1] && !used[i-1]){
                continue;
            }
            
            used[i] = true;
            sb.append(arr[i]);
    
            backtrack(arr, sb, used, res);
            
            sb.deleteCharAt(sb.length() - 1);
            used[i] = false;
        }
        
        
        return res;
    }
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> res = new ArrayList<>();
        
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        
        boolean used[] = new boolean[s.length()];
        StringBuilder sb = new StringBuilder();
        return backtrack(arr, sb, used, res);
    }
}