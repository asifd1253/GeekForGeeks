
class Pair implements Comparable<Pair>{
    int val;
    int idx;
    
    Pair(int val, int idx){
        this.val = val;
        this.idx = idx;
    }
    
    @Override
    public int compareTo(Pair p2){
        //ascending order
        // return this.val - p2.val;
        
        //descending order
        return p2.val - this.val;
    }
}

class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        //1st window
        for(int i=0; i<k; i++){
            pq.offer(new Pair(arr[i], i));
        }
        
        res.add(pq.peek().val);
        
        for(int i=1; i<n-k+1; i++){
            while(!pq.isEmpty() && pq.peek().idx < i){
                pq.poll();
            }
            
            pq.offer(new Pair(arr[i+k-1], i+k-1));
            
            res.add(pq.peek().val);
        }
        
        return res;
    }
}