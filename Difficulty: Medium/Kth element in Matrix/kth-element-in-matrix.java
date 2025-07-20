class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                pq.add(mat[i][j]);
            }
        }
        
        for(int i=1; i<k; i++){
            pq.remove();
        }
        
        return pq.peek();
    }
}