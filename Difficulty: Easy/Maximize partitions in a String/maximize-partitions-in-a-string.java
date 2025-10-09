class Solution {
    public int maxPartitions(String s) {
        // code here
        int lastIdx[] = new int[26];
        
        for(int i=0; i<s.length(); i++){
            lastIdx[s.charAt(i) - 'a'] = i;
        }
        
        int maxLastIdx = 0;
        int totalPart = 0;
        
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            
            maxLastIdx = Math.max(maxLastIdx, lastIdx[idx]);
            
            if(maxLastIdx == i){
                totalPart++;
            }
        }
        
        return totalPart;
    }
}