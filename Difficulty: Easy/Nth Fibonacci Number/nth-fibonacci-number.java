class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n == 0 || n == 1){
            return n;
        }
        
        int a = 0;
        int b = 1;
        
        for(int i=0; i<n; i++){
            int c = a+b;
            
            a = b;
            b = c;
        }
        
        return a;
    }
}