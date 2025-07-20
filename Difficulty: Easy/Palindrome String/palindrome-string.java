class Solution {
    boolean isPalindrome(String s) {
        // code here
        if(s.length() == 1){
            return true;
        }
        
        int left = 0;
        int right = s.length()-1;
        
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
                continue;
            }else{
                return false;
            }
        }
        
        return true;
    }
}