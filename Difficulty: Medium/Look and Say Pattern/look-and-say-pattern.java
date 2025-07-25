class Solution {
    public String countAndSay(int n) {
        // code here
        if(n == 1){
            return "1";
        }
        
        String s = countAndSay(n-1);
        
        int counter = 0;
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            counter++;
            if(i == s.length()-1 || s.charAt(i) != s.charAt(i+1)){
                str.append(counter);
                str.append(s.charAt(i));
                counter = 0;
            }
        }
        
        return str.toString();
    }
}
