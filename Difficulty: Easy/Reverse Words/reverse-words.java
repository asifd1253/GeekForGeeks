class Solution {
    public String reverseWords(String s) {
        // Code here
        StringBuilder sb = new StringBuilder();
        
        int st = s.length()-1;
        
        while(st >= 0){
            while(st >=0 && s.charAt(st) == '.'){
                st--;
            }
            
            if(st < 0) break;
            
            int end = st;
            
            while(st >=0 && s.charAt(st) != '.'){
                st--;
            }
            
            if(sb.length() == 0){
                sb.append(s.substring(st+1, end+1));
            }else{
                sb.append('.').append(s.substring(st+1, end+1));
            }
        }
        
        return sb.toString();
    }
}
