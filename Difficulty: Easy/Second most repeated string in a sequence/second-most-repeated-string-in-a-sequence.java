// User function Template for Java

class Solution {
    String secFrequent(String arr[], int N) {
        // your code here
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s : arr){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int curFreq : map.values()){
            if(curFreq > firstMax){
                secondMax = firstMax;
                firstMax = curFreq;
            }else if(curFreq > secondMax && curFreq < firstMax){
                secondMax = curFreq;
            }
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == secondMax) return entry.getKey();
        }
        
        return "";
    }
}