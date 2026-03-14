class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        ArrayList<Integer> res = new ArrayList<>();
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : arr){
            if(!set.contains(i) && res.size() < 2){
                res.add(i);
            }
            
            set.add(i);
        }
        
        if(res.size() == 1){
            res.set(0, -1);
        }
        
        return res;
    }
}
