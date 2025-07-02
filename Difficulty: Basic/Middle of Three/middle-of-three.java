// User function Template for Java

class Solution {
    int middle(int a, int b, int c) {
        // code here
        // if((a<b && a>c) || (a>b && a<c)){
        //     return a;
        // }else if((b<c && b>a) || (b>c && b<a)){
        //     return b;
        // }else{
        //     return c;
        // }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(a);
        pq.add(b);
        pq.add(c);
        pq.remove();
        return pq.peek();
    }
}