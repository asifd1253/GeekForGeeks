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
        // (parent, node, weight)
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(int pair1[],int pair2[]){
                return pair1[2] - pair2[2];
            }
        });
        pq.add(new int[]{-1,0,0});
        
        boolean visit[] = new boolean[V];
        int sum = 0;
        List<int[]> edges = new ArrayList<>();
        
        while(!pq.isEmpty()){
            int object[] = pq.poll();
            int parent = object[0];
            int node = object[1];
            int weight = object[2];
            
            // if the node already visited
            if(visit[node]){
                continue;
            }
            
            visit[node] = true;
            
            if(parent != -1){
                edges.add(new int[]{parent,node});
                sum += weight;
            }
            
            for(int neighbourObject[] : adj.get(node)){
                int neighbourNode = neighbourObject[0];
                int neighbourWeight = neighbourObject[1];
                
                if(!visit[neighbourNode]){
                    pq.add(new int[]{node,neighbourNode,neighbourWeight});
                }
        
            }
        }
        
        
        return sum;
    }
}