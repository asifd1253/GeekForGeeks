/*complete the Function*/

class Solution {
    boolean isValid(String s){
        if(s.length() == 0 || s.length() > 3){
            return false;
        }

        if(s.charAt(0) == '0' && s.length() > 1){
            return false;
        }
        
        int num = Integer.parseInt(s);
        
        return num >= 0 && num <= 255;
    }
    
    public ArrayList<String> generateIp(String s) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        
        int n = s.length();
        
        for(int i=1; i<=3 && i<n-2; i++){
            for(int j=i+1; j<=i+3 && j<n-1; j++){
                for(int k=j+1; k<=j+3 && k<n; k++){
                    String part1 = s.substring(0, i);
                    String part2 = s.substring(i, j);
                    String part3 = s.substring(j, k);
                    String part4 = s.substring(k, n);
                    
                    if(isValid(part1) && isValid(part2) && isValid(part3) && isValid(part4)){
                        res.add(part1+"."+part2+"."+part3+"."+part4);
                    }
                }
            }
        }
        
        return res;
    }
}