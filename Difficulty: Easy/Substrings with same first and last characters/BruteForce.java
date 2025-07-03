class Solution {
    public int countSubstring(String s) {
        // code here
       int count = 0;
        
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
        }
        
        return count;
        
    }
}
