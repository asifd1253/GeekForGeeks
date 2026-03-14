// User function Template for Java

class Solution {
    public static int findMean(int[] arr) {
        // code here
        int sum = 0;
        
        for(int i : arr){
            sum += i;
        }
        
        int n = arr.length;
        
        return sum/n;
    }
};