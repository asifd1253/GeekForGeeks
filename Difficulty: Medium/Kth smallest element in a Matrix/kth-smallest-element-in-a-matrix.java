class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int arr[] : mat){
            for(int i : arr){
                pq.offer(i);
                
                if(pq.size() > k) pq.poll();
            }
        }
        
        return pq.peek();
    }
}
