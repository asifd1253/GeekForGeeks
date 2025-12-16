class Solution {
    public int findUnique(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : arr){
            if(set.contains(i)) set.remove(i);
            else set.add(i);
        }
        
        int ans = -1;
        
        for(int val : set) ans = val;
        
        return ans;
    }
}