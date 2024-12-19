//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.maxRemove(arr, n);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    public void dfs(int src,List<List<Integer>> adjList,boolean visited[]){
        visited[src] = true;
        for(int neighbour : adjList.get(src)){
            if(!visited[neighbour]){
                dfs(neighbour,adjList,visited);
            }
        }
    }
    
    int maxRemove(int[][] stones, int n) {
        // Code here
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<n; i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(stones[i][0] == stones[j][0] ||stones[i][1] == stones[j][1]){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        
        boolean visited[] = new boolean[n];
        int components = 0;
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i,adjList,visited);
                components++;
            }
        }
        
        return n-components;
    }
};
