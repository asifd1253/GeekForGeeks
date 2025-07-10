class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int curSum = 0;
        map.put(0,1);
        
        for(int ele : arr){
            curSum = curSum + ele;
            if(map.containsKey(curSum)){
                count = count + map.get(curSum);
            }
            map.put(curSum, map.getOrDefault(curSum, 0)+1);
            
        }
        
        return count;
    }
}
