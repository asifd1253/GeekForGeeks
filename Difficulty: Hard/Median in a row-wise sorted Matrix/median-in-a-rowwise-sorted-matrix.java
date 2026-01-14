class Solution {
    public int median(int[][] mat) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int r = mat.length;
        int c = mat[0].length;
        
        int size = r*c;
        
        for(int arr[] : mat){
            for(int i : arr){
                pq.offer(i);
                if(pq.size() > (size/2 +1)){
                    pq.poll();
                }
                
            }
        }
       
        return pq.peek();
    }
}