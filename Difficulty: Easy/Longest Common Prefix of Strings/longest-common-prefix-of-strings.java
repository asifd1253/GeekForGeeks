// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if(arr.length == 0) return "";
        
        String firstString = arr[0];
        
        for(int i=1; i<arr.length; i++){
            String curString = arr[i];
            
            while(!curString.startsWith(firstString)){
                firstString = firstString.substring(0, firstString.length()-1);
                
                if(firstString.length() == 0) return "";
            }
        }
        
        return firstString;
    }
}