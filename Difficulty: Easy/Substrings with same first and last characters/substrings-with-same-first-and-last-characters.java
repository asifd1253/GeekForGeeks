class Solution {
    public int countSubstring(String s) {
        // code here
       
        int freq[] = new int[26];
        
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        
        int count = 0;
        for(int j=0; j<26; j++){
            count += (freq[j]*(freq[j]+1))/2;
        }
        
        return count;
    }
}