// User function Template for Java
class Solution {
    String printSequence(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        String refArray[] = {
            "2", "22", "222", "3", "33", "333",
            "4", "44", "444", "5", "55", "555", "6", "66", "666",
            "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999"
        };
        
        for(int i=0; i<s.length(); i++){
            int curChar = s.charAt(i);
            
            if(curChar == ' '){
                sb.append("0");
                continue;
            }
            
            int idx = curChar - 'A';
            
            sb.append(refArray[idx]);
        }
        
        return sb.toString();
    }
}