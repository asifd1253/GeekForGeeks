class Solution {
    static String lookandsay(int n) {
        // your code here
        if(n == 1){
            return "1";
        }
        
        String s = lookandsay(n-1);
        
        int counter = 0;
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            counter++;
            if(i == s.length()-1 || s.charAt(i) != s.charAt(i+1)){
                res.append(counter);
                res.append(s.charAt(i));
                counter = 0;
            }
        }
        
        return res.toString();
    }
}
