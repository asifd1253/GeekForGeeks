class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : a){
            pq.add(i);
        }
        for(int j : b){
            pq.add(j);
        }
        
        for(int i=0; i<a.length; i++){
            a[i] = pq.remove();
        }
        
        for(int j=0; j<b.length; j++){
            b[j] = pq.remove();
        }
    }
}
