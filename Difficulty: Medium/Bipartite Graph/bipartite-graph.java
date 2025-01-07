//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            S = br.readLine().trim().split(" ");
            int E = Integer.parseInt(S[0]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<Integer>());
            }
            for (int i = 0; i < E; i++) {
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(adj);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public boolean colorIt(int src,ArrayList<ArrayList<Integer>> adj,int colored[]){
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        colored[src] = 0;  //0->green
        
        while(!q.isEmpty()){
            int node = q.poll();
            for(int neighbour : adj.get(node)){
                if(colored[neighbour] == -1){
                    colored[neighbour] = 1-colored[node];
                    q.offer(neighbour);
                }else if(colored[neighbour] == colored[node]){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public boolean isBipartite(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int colored[] = new int[adj.size()];
        Arrays.fill(colored,-1);
        
        for(int i=0; i<adj.size(); i++){
            if(colored[i] == -1){
                if(!colorIt(i,adj,colored)){
                    return false;
                }
            }
        }
        
        return true;
    }
}