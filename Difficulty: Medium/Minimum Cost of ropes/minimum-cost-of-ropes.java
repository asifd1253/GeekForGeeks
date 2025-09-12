class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : arr){
            pq.offer(i);
        }
        
        int totalCost = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            
            totalCost += (first+second);
            pq.offer(first+second);
        }
        
        return totalCost;
    }
}