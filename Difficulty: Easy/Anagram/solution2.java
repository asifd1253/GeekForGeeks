class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        
        //Base case
        if(s1.length() != s2.length()){
            return false;
        }
        
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        
        for(int i=0; i<s1.length(); i++){
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
}
