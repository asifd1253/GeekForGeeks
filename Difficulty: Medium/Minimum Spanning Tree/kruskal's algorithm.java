//{ Driver Code Starts


import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static PrintWriter ot;

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int V = Integer.parseInt(br.readLine().trim());
            int E = Integer.parseInt(br.readLine().trim());
            List<List<int[]>> list = new ArrayList<>();
            for (int i = 0; i < V; i++) list.add(new ArrayList<>());
            for (int i = 0; i < E; i++) {
                String[] s = br.readLine().trim().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                int c = Integer.parseInt(s[2]);
                list.get(a).add(new int[] {b, c});
                list.get(b).add(new int[] {a, c});
            }
            ot.println(new Solution().spanningTree(V, E, list));

            ot.println("~");
        }
        ot.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(int pair1[], int pair2[]){
                return pair1[2] - pair2[2];
            }
        });
        
        for(int i=0; i<V; i++){
            for(int edge[] : adj.get(i)){
                pq.add(new int[]{i,edge[0],edge[1]});
            }
        }
        
        DisJointSet dsu = new DisJointSet(V);
        int sum = 0;
        
        while(!pq.isEmpty()){
            int edge[] = pq.remove();
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            
            if(dsu.unionBySize(u,v)){
                sum += w;
            }
        }
        
        return sum;
        
    }
}

class DisJointSet{
        int parent[];
        int size[];
        
        DisJointSet(int nodes){
            this.parent = new int[nodes];
            this.size = new int[nodes];
            
            for(int i=0; i<nodes; i++){
                parent[i] = i;
                size[i] = 1;
            }
        }
        
        public boolean unionBySize(int node1, int node2){
            int rootParent1 = findRootParent(node1);
            int rootParent2 = findRootParent(node2);
            
            // if root parent is same means continue
            if(rootParent1 == rootParent2){
                return false;  //the nodes will not make union
            }
            
            // else union the component
            if(size[rootParent1] < size[rootParent2]){
                parent[rootParent1] = rootParent2;
                size[rootParent2] += size[rootParent1];
            }else{
                parent[rootParent2] = rootParent1;
                size[rootParent1] += size[rootParent2];
            }
            
            return true;  //the nodes will become union
        }
        
        public int findRootParent(int node){
            if(node == parent[node]){
                return node;
            }
            
            parent[node] = findRootParent(parent[node]);
            
            return parent[node];
        }
    }
