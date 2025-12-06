class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : arr){
            pq.offer(i);
        }
        
        int cost = 0;
        
        while(!pq.isEmpty()){
            if(pq.size() == 1) break;
            
            int first = pq.poll();
            int second = pq.poll();
            
            cost += first + second;
            
            pq.offer(first+second);
        }
        
        return cost;
    }
}