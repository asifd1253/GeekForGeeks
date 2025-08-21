class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        int winStart = 0;
        int winEnd = 0;
        int maxLen = Integer.MIN_VALUE;
        int curLen = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        while(winEnd < n){
            char curChar = s.charAt(winEnd);
            if(!set.contains(curChar)){     //Expansion
                set.add(curChar);
                curLen = winEnd - winStart +1;
                maxLen = Math.max(maxLen, curLen);
                winEnd++;
            }else{                          //Shrinking
                while(winStart < winEnd && set.contains(curChar)){
                    set.remove(s.charAt(winStart));
                    winStart++;
                }
            }
        }
        
        return maxLen;
    }
}