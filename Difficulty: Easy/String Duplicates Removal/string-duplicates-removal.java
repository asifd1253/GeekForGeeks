// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        Set<Character> set = new LinkedHashSet<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        
        StringBuilder str = new StringBuilder();
        for(char ch : set){
            str.append(ch);
        }
        
        return str.toString();
    }
}
