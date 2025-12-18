class Solution {
    public int countMinReversals(String s) {
        // code here
        if(s.length()%2 != 0) return -1;
        
        int left = 0;
        int right = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == '{'){
                left++;
            }else{
                if(left > 0){
                    left--;
                }else{
                    right++;
                }
            }
        }
        
        int totalLeftReversal = (int)Math.ceil(left/2.0);
        int totalRightReversal = (int)Math.ceil(right/2.0);
        
        return totalLeftReversal + totalRightReversal;
    }
}