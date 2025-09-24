// User function Template for Java
class Solution {
    int findLength(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        int startIdx = s.length()-1;
        while(startIdx >= 0){
            while(startIdx >= 0 && s.charAt(startIdx) == ' '){
                startIdx--;
            }
            
            if(startIdx < 0){
                break;
            }
            
            int endIdx = startIdx;
            
            while(startIdx >= 0 && s.charAt(startIdx) != ' '){
                startIdx--;
            }
            
            sb.append(s.substring(startIdx+1, endIdx+1));
            break;
        }
        
        return sb.length();
    }
}