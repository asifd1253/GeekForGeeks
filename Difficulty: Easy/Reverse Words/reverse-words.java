class Solution {
    public String reverseWords(String s) {
        // Code here
        StringBuilder res = new StringBuilder();
        
        int stIdx = s.length()-1;
        
        while(stIdx >= 0){
            while(stIdx >= 0 && s.charAt(stIdx) == '.'){
                stIdx--;
            }
            
            if(stIdx < 0){
                break;    
            }
            
            int endIdx = stIdx;
            
            while(stIdx >= 0 && s.charAt(stIdx) != '.'){
                stIdx--;
            }
            
            if(res.length() == 0){
                res.append(s.substring(stIdx+1, endIdx+1));
            }else{
                res.append('.').append(s.substring(stIdx+1, endIdx+1));
            }
        }
        
        return res.toString();
        
    }
}
