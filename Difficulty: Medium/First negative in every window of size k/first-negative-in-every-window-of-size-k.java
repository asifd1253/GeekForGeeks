class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        Queue<Integer> q = new LinkedList<>();
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        
        int idx = 0;
        while(idx < k && k < n){
            if(arr[idx] < 0){
                q.offer(arr[idx]);
            }
            idx++;
        }
        if(q.isEmpty()){
            res.add(0);
        }else{
            res.add(q.peek());
        }
        
        for(int i=1; i<n-k+1; i++){
            //remove
            if(arr[i-1] < 0){
                q.poll();
            }
            //add
            if(arr[i+k-1] < 0){
                q.offer(arr[i+k-1]);
            }
            
            res.add(q.isEmpty()?0:q.peek());
        }
        
        return res;
    }
}