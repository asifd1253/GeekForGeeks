// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        
        for(char ch : s.toCharArray()){
            lhs.add(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : lhs){
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
