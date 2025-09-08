class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> q) {
        // code here.
        Stack<Integer> st = new Stack<>();
        
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        
        return q;
    }
}