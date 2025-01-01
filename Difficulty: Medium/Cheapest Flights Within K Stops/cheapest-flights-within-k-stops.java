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
            int edge=sc.nextInt();
            int[][] adj = new int[edge][3];
            for(int i=0;i<edge;i++){
                adj[i][0]=sc.nextInt();
                adj[i][1]=sc.nextInt();
                adj[i][2]=sc.nextInt();
            }
            int src=sc.nextInt();
            int dst=sc.nextInt();
            int k=sc.nextInt();
            Solution obj = new Solution();
            int res = obj.CheapestFLight(n,adj,src,dst,k);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    
    public int CheapestFLight(int n,int flights[][],int src,int dst,int k) {
        // Code here
        int dist[] = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        
        for(int i=0; i<k+1; i++){
            int temp[] = Arrays.copyOf(dist,n);
            for(int flight[] : flights){
                int u = flight[0];
                int v = flight[1];
                int w = flight[2];
                
                if(dist[u] != Integer.MAX_VALUE && dist[u]+w < temp[v]){
                    temp[v] = dist[u]+w;
                }
            }
            dist = temp;
        }
        
        return (dist[dst]==Integer.MAX_VALUE)?-1:dist[dst];
    }
}