  public static int findCatalan(int n) {
        // code here
        if(n==0 || n==1){
            return 1;
        }
        
        int ans = 0;
        
        for(int i=0; i<=n-1; i++){
            ans += findCatalan(i) * findCatalan(n-1-i);
        }
        
        return ans;
    }

/*

findCatalan(3)
   |
   |-- findCatalan(0) * findCatalan(2)
   |       |
   |       |-- findCatalan(0) * findCatalan(1) = 1 * 1 = 1
   |       |-- findCatalan(1) * findCatalan(0) = 1 * 1 = 1
   |       Result: 1 + 1 = 2
   |
   |-- findCatalan(1) * findCatalan(1) = 1 * 1 = 1
   |
   |-- findCatalan(2) * findCatalan(0)
           |
           |-- findCatalan(0) * findCatalan(1) = 1 * 1 = 1
           |-- findCatalan(1) * findCatalan(0) = 1 * 1 = 1
           Result: 1 + 1 = 2
   |
   Result: 2 + 1 + 2 = 5
   
   */
   
   
   
