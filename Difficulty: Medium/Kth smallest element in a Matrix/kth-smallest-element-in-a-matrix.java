class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int r=0; r<mat.length; r++){
            for(int c=0; c<mat[0].length; c++){
                pq.offer(mat[r][c]);
            }
        }
        
        for(int i=0; i<k-1; i++){
            pq.poll();
        }
        
        return pq.peek();
    }
}
