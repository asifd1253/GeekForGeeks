class solve {

    // Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int n) {
        // Your code here
        Queue<String> q = new LinkedList<>();
        
        q.offer("1");
        ArrayList<String> res = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            String curr = q.remove();
            
            res.add(curr);
            q.offer(curr + "0");
            q.offer(curr + "1");
        }
        
        return res;
    }
}
