class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : arr){
            set.add(i);
        }
        
        int counter = 0;
        
        int idx = 1;
        
        while(true){
            if(!set.contains(idx)) counter++;
            
            if(counter == k) return idx;
            
            idx++;
        }
        
    }
}