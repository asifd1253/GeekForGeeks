class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        if(!map.containsKey(target)){
            return 0;
        }
        
        return map.get(target);
    }
}
