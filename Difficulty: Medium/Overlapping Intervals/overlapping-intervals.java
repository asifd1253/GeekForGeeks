class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr, (a,b)->{
            return a[0]-b[0];
        });
        
        ArrayList<int[]> res = new ArrayList<>();
        
        res.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            int curArr[] = arr[i];
            
            int prevArr[]  = res.get(res.size()-1);
            
            if(prevArr[1] >= curArr[0]){
                prevArr[1] = Math.max(prevArr[1], curArr[1]);
            }else{
                res.add(curArr);
            }
        }
        
        ArrayList<ArrayList<Integer>> finalArr = new ArrayList<>();
        for(int ar[] : res){
            ArrayList<Integer> t = new ArrayList<>();
            t.add(ar[0]);
            t.add(ar[1]);
            finalArr.add(t);
        }
        
        return finalArr;
    }
}