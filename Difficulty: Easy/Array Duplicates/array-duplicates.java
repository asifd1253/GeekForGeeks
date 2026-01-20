class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i : arr){
            if(set.contains(i)){
                res.add(i);
            }
            set.add(i);
        }
        
        return res;
    }
}