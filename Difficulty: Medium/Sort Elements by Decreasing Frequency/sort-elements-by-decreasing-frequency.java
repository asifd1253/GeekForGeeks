// User function Template for Java
class helper{
    
}
class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        ArrayList<Integer> res = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[1] != b[1]){
                return b[1] - a[1];
            }
            
            return a[0] - b[0];
        });
        
        map.forEach((key, val)->{
            pq.offer(new int[]{key, val});
        });
        
        while(!pq.isEmpty()){
            int cur[] = pq.poll();
            
            int curEle = cur[0];
            int curFreq = cur[1];
            
            for(int i=0; i<curFreq; i++){
                res.add(curEle);
            }
        }
        
        return res;
    }
}
