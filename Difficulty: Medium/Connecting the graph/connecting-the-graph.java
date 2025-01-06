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
            int m = sc.nextInt();
            int[][] edge = new int[m][2];
            for (int i = 0; i < m; i++) {
                edge[i][0] = sc.nextInt();
                edge[i][1] = sc.nextInt();
            }

            Solution obj = new Solution();
            int ans = obj.Solve(n, edge);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    class DisJointSet{
        int parent[];
        int size[];
        
        DisJointSet(int nodes){
            this.parent = new int[nodes];
            this.size = new int[nodes];
            
            for(int i=0; i<nodes; i++){
                this.parent[i] = i;
                this.size[i] = 1;
            }
        }
        
        public boolean unionBySize(int node1,int node2){
            int rootParent1 = findRootParent(node1);
            int rootParent2 = findRootParent(node2);
            
            // if rootParent is same mean continue
            if(rootParent1 == rootParent2){
                return false;
            }
            
            // else union the component
            if(size[rootParent1] < size[rootParent2]){
                parent[rootParent1] = rootParent2;
                size[rootParent2] += size[rootParent1];
            }else{
                parent[rootParent2] = rootParent1;
                size[rootParent1] += size[rootParent2];
            }
            
            return true;
        }
        
        public int findRootParent(int node){
            if(node == parent[node]){
                return node;
            }
            
            parent[node] = findRootParent(parent[node]);
            return parent[node];
        }
    }
    public int Solve(int n, int[][] edges) {
        // Code here
        if(edges.length < n-1){
            return -1;
        }
        
        int wires = 0;
        DisJointSet dsu = new DisJointSet(n);
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            
            if(dsu.unionBySize(u,v)){
                wires++;
            }
        }
        
        // for connecting n nodes we require a minimum n-1 edges
        // so minimum wires required = (n-1) - wires
        
        return n-1-wires;
    }
}