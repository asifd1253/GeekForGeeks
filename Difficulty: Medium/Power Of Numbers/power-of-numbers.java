class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int reverse = 0;
        int temp = n;
        
        while(temp >= 0){
            int lastDigit;
            if(temp %10 == 0){
                temp = temp/10;
                continue;
            }else{
                lastDigit = temp%10;
            }
            
            reverse = reverse + lastDigit;
            temp = temp-10;
        }
        
        return (int)Math.pow(n, reverse);
    }
}
                                                                                                                    