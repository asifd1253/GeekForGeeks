class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        int curSum = 0;
        int counter = 0;
        
        for(int ele : arr){
            curSum += ele;
            
            if(map.containsKey(curSum)){
                counter += map.get(curSum);
            }
            
            map.put(curSum, map.getOrDefault(curSum, 0)+1);
        }
        
        return counter;
    }
}
