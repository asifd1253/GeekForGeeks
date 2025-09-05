class Queues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    void push(int a) {
        // code here
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        
        if(q1.isEmpty()){
            q1.add(a);
        }
        
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        
    }

    int pop() {
        
        // code here
        return q1.isEmpty()?-1:q1.remove();
    }
}