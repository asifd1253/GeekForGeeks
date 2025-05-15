//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 
        
        Integer nextInt(){
            return Integer.parseInt(next());
        }
    } 
    
    public static void main(String args[])
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t>0)
        {
            int R = sc.nextInt();
            int C = sc.nextInt();
            
            char mat[][] = new char[R][C];
            for(int i=0;i<R;i++)
            {
                for(int j=0;j<C;j++)
                {
                    mat[i][j] = sc.next().charAt(0);
                }
            }
            String target  = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.findOccurrence(mat,target));
            
            t--;
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int R;
    int C;
    public int findOccurrence(char mat[][], String target) {
        // Write your code here
        R = mat.length;
        C = mat[0].length;
        int count = 0;
        boolean visited[][] = new boolean[R][C];
        
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(mat[i][j] == target.charAt(0)){
                    count += dfs(mat, visited, 0, i, j, target);
                }
            }
        }
        
        return count;
    }
    
    public int dfs(char mat[][], boolean visited[][], int idx, int i, int j, String target){
        if(i<0 || i>=R || j<0 || j>=C || visited[i][j] == true || mat[i][j] != target.charAt(idx)){
            return 0;
        }
        
        if(idx == target.length()-1){
            return 1;
        }
        
        int found = 0;
        
        visited[i][j] = true;
        found += dfs(mat, visited,idx+1, i-1, j, target);
        found += dfs(mat, visited,idx+1, i, j+1, target);
        found += dfs(mat, visited,idx+1, i+1, j, target);
        found += dfs(mat, visited,idx+1, i, j-1, target);
        
        visited[i][j] = false;
        
        return found;
    }
}