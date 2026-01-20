class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : a){
            set.add(i);
        }
        
        for(int i : b){
            set.add(i);
        }
        
        for(int val : set){
            res.add(val);
        }
        
        return res;
    }
}