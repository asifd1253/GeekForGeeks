// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        // StringBuilder str = new StringBuilder();
        
        // for(int i=s.length()-1; i>=0; i--){
        //     str.append(s.charAt(i));
        // }
        
        // return str.toString();
        
        int left = 0;
        int right = s.length()-1;
        
        StringBuilder sb = new StringBuilder(s);
        
        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            
            sb.setCharAt(left, rightChar);
            sb.setCharAt(right, leftChar);
            
            left++;
            right--;
        }
        
        return sb.toString();
    }
}