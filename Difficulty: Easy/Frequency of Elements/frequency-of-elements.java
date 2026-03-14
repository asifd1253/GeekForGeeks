class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            ArrayList<Integer> temp = new ArrayList<>();
            
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            
            res.add(temp);
        }
        
        return res;
    }
}