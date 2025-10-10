// User function Template for Java

class Solution {
    int middle(int a, int b, int c) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.add(a);
        pq.add(b);
        pq.add(c);
        pq.remove();
        
        return pq.peek();
    }
}