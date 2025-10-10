class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key) > (arr.length/2)) return key;
        }
        
        return -1;
    }
}