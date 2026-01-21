class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        ArrayList<int[]> res = new ArrayList<>();
        
        Arrays.sort(arr, (a,b)->a[0] - b[0]);
        
        for(int interval[] : arr){
            if(res.isEmpty() || res.get(res.size()-1)[1] < interval[0]){
                res.add(interval);
            }else{
                int curIdx = res.size()-1;
                
                int curInterval[] = res.get(curIdx);
                int max = Math.max(res.get(curIdx)[1], interval[1]);
                
                curInterval[1] = max;
                
                res.set(curIdx, curInterval);
            }
        }
        
        return res;
    }
}