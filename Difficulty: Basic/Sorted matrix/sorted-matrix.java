// User function Template for Java

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int arr[] : Mat){
            for(int i : arr){
                pq.offer(i);
            }
        }
        
        int res[][] = new int[N][N];
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                res[i][j] = pq.poll();
            }
        }
        
        return res;
    }
};