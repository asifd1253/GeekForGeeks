class Solution {
    public static String countSort(String s) {
        // code here
        int freq[] = new int[26];
        
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<26; i++){
            int curCharCount = freq[i];
            while(curCharCount > 0){
                sb.append((char)('a'+i));
                curCharCount--;
            }
        }
        
        return sb.toString();
    }
}