class Solution {
    public int countSubstring(String s) {
        // code here
        int freq[] = new int[26];
        
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        
        int res = 0;
        for(int f : freq){
            res += (f * (f+1))/2;
        }
        
        return res;
    }
}