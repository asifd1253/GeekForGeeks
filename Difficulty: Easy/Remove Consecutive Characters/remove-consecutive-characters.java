// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        sb.append(s.charAt(0));
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                continue;
            }else{
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}