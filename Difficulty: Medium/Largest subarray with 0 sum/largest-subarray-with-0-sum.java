class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int curSum = 0;
        int maxLen = 0;
        
        for(int i=0; i<arr.length; i++){
            curSum += arr[i];
            
            if(curSum == 0){
                maxLen = i+1;
            }
            
            if(map.containsKey(curSum)){
                maxLen = Math.max(maxLen, i-map.get(curSum));
            }else{
                map.put(curSum, i);
            }
        }
        
        return maxLen;
    }
}