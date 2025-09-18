class Solution {
    public int minFlips(String s) {
        // Code here
        int patOneFlip = 0;
        int patTwoFlip = 0;
        
        for(int i=0; i<s.length(); i++){
            //pattern 1 ==> 010101010
            if(i%2 == 0){
                if(s.charAt(i) != '0') patOneFlip++;
                if(s.charAt(i) != '1') patTwoFlip++;
            }
            //pattern 2 ==> 101010101
            else{
                if(s.charAt(i) != '1') patOneFlip++;
                if(s.charAt(i) != '0') patTwoFlip++;
            }
        }
        
        return Math.min(patOneFlip, patTwoFlip);
    }
}