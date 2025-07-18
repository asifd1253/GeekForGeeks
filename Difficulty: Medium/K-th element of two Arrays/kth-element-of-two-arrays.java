// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : a){
            pq.add(i);
        }
        
        for(int i : b){
            pq.add(i);
        }
        
        for(int i=1; i<k; i++){
            pq.remove();
        }
        
        return pq.peek();
    }
}