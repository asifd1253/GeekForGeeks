// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int res = 0;
        
        for(int curNum : arr){
            int complement = target - curNum;
            
            if(map.containsKey(complement)){
                res = res + map.get(complement);
            }
            
            map.put(curNum, map.getOrDefault(curNum, 0)+1);
            
        }
        
        return res;
    }
}
