class Solution {
    public int findUnique(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        int ans = -1;
        
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                ans = i;
            }
        }
        
        return ans;
    }
}