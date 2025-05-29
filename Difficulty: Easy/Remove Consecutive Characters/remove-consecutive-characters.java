// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        
        res.append(s.charAt(0));
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i - 1)){
                res.append(s.charAt(i));
            }
        }
        
        return res.toString();
    }
}