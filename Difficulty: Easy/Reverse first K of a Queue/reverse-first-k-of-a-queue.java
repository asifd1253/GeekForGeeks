class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Deque<Integer> dq = new LinkedList<>();
        
        if(q.size() < k){
            return q;
        }
        
        while(k-- > 0){
            dq.offerFirst(q.poll());
        }
        
        while(!q.isEmpty()){
            dq.offerLast(q.poll());
        }
        
        Queue<Integer> res = new LinkedList<>(dq);
        return res;
    }
}