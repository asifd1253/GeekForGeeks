class Solution {
    public int reverseExponentiation(int n) {
        // code here
        // int reverse = 0;
        // int temp = n;
        
        // while(temp > 0){
        //     int lastDigit = temp % 10;
        //     reverse = reverse * 10 + lastDigit;
        //     temp = temp / 10;
        // }
        
        // return (int)Math.pow(n, reverse);
        
        String s = String.valueOf(n);
        
        StringBuilder str = new StringBuilder();
        
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            str.append(ch);
        }
        
        int revNum = Integer.valueOf(str.toString());
        
        return (int)Math.pow(n, revNum);
    }
}
