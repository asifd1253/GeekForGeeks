// User function Template for Java

class Solution {
    static boolean isLeap(int n) {
        // code here
        if(n%400 == 0){
            return true;
        }else if(n%100 == 0){
            return false;
        }else if(n%4 == 0){
            return true;
        }else{
            return false;
        }
    }
}