// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        
        for(int i : arr){
            int complement = target - i;
            
            if(map.containsKey(complement)) count += map.get(complement);
            
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        return count;
    }
}
