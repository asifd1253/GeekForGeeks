import java.util.*;
class Solution {
    public static boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for(int i=0; i<s1.length(); i++){
            char s1char = s1.charAt(i);
            char s2char = s2.charAt(i);
            
            if(map1.containsKey(s1char)){
                if(map1.get(s1char) != s2char){
                    return false;
                }
            }else{
                if(map2.containsKey(s2char)){
                    return false;
                }
                
                map1.put(s1char, s2char);
                map2.put(s2char, s1char);
            }
        }
        
        return true;
    }
}