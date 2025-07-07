class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        int times = arr.length/k;
        int count = 0;
        
        for(int key : map.keySet()){
            if(map.get(key) > times){
                count++;
            }
        }
        
        return count;
    }
}