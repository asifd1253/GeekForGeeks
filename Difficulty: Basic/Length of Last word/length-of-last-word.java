// User function Template for Java
class Solution {
    int findLength(String s) {
        // code here
        String arr[] = s.split(" ");
        
        int count = 0;
        for(int i=arr[arr.length-1].length()-1; i>=0; i--){
            count++;
        }
        
        return count;
    }
}