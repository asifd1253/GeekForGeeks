class Solution {
    public String reverseWords(String s) {
        // Code here
        StringBuilder sb = new StringBuilder();
        
        int startIdx = s.length()-1;
        
        while(startIdx >= 0){
            while(startIdx >= 0 && s.charAt(startIdx) == '.'){
                startIdx--;
            }
            
            if(startIdx < 0) break;
            
            int endIdx = startIdx;
            
            while(startIdx >= 0 && s.charAt(startIdx) != '.'){
                startIdx--;
            }
            
            if(sb.length() == 0){
                sb.append(s.substring(startIdx+1, endIdx+1));
            }else{
                sb.append('.').append(s.substring(startIdx+1, endIdx+1));
            }
        }
        
        return sb.toString();
    }
}
