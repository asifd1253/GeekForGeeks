// User function Template for Java

class Solution {
    static int sumOfNaturals(int n) {
        // code here
        if(n == 0) return 0;
        
        return n + sumOfNaturals(n-1);
    }
};
