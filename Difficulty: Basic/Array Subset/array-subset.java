
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : a){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(int i : b){
            if(!map.containsKey(i) || map.get(i) == 0){
                return false;
            }else{
                map.put(i, map.getOrDefault(i, 0)-1);
            }
        }
        
        return true;
    }
}
