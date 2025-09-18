class Solution {
    public int romanToDecimal(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int result = 0;
        
        for(int i=0; i<s.length(); i++){
            
            if(i == s.length()-1){
                result += map.get(s.charAt(i));
                break;
            }
            
            int curVal = map.get(s.charAt(i));
            int nextVal = map.get(s.charAt(i+1));
            
            if(curVal >= nextVal){
                result = result + curVal;
            }else{
                result = result - curVal;
            }
        }
        
        return result;
    }
}