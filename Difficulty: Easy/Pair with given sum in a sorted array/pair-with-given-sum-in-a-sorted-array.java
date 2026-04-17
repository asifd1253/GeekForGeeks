// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int res = 0;
        for(int i : arr){
            int compliment = target - i;
            
            if(map.containsKey(compliment)){
                res = res + map.get(compliment);
            }
            
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        return res;
    }
}
