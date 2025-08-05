class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : a){
            pq.add(i);
        }
        
        for(int i : b){
            pq.add(i);
        }
        
        int arr[] = new int[pq.size()];
        
        int idx = 0;
        while(!pq.isEmpty()){
            arr[idx++] = pq.peek();
            pq.remove();
        }
        
        int start = 0;
        int end = arr.length-1;
        
        int mid = start + (end - start)/2;
        
        double res = 0.0;
        
        if(arr.length % 2 == 0){
            res = (arr[mid] + arr[mid+1])/2.0;
        }else{
            res = (double)arr[mid];
        }
        
        return res;
    }
}