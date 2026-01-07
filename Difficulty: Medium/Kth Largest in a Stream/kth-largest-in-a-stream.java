class Solution {
    static int[] kthLargest(int k, int[] arr, int n) {
        // code here
        int res[] = new int[n];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<n; i++){
            
            pq.offer(arr[i]);
            
            if(pq.size() > k){
                pq.poll();
            }
            
            res[i] = (pq.size() == k)?pq.peek():-1;
        }
        
        return res;
    }
};