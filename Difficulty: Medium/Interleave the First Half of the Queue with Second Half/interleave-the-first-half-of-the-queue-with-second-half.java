class Solution {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> q2 = new LinkedList<>();
        int size = q.size();
        
        for(int i=0; i<size/2; i++){
            q2.offer(q.remove());
        }
        
        while(!q2.isEmpty()){
            q.offer(q2.remove());
            q.offer(q.remove());
        }
        
        
        return q;
    }
}
