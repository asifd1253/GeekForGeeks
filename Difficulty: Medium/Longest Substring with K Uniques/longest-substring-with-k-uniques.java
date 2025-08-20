class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int n = s.length();
        int winStart = 0;
        int winEnd = 0;
        int curLen = 0;
        int maxLen = Integer.MIN_VALUE;
        int uniqueCharCount = 0;
        int freq[] = new int[26];
        
        while(winEnd < n){
            int idx = s.charAt(winEnd) - 'a';
            if(freq[idx] == 0){
                uniqueCharCount++;
                freq[idx]++;
            }else{
                freq[idx]++;
            }
            
            if(uniqueCharCount == k){
                curLen = winEnd - winStart +1;
                maxLen = Math.max(maxLen, curLen);
            }//shriking phase
            else if(uniqueCharCount > k){
                while(winStart < winEnd && uniqueCharCount > k){
                    idx = s.charAt(winStart) - 'a';
                    freq[idx]--;
                    if(freq[idx] == 0){
                        uniqueCharCount--;
                    }
                    winStart++;
                }
            }
            
            winEnd++;
        }
        
        return (maxLen == Integer.MIN_VALUE)?-1:maxLen;
    }
    
    
    
    
    
    
    
    
    
    
    
}