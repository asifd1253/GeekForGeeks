// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if(arr.length == 0 || arr == null){
            return "";
        }
        
        String prefixString = arr[0];
        
        for(int i=1; i<arr.length; i++){
            String currString = arr[i];
            
            while(!currString.startsWith(prefixString)){
                
                // let original prefixString characters = 6
                // Here is the main logic .substring(0, n) ---> (0, 6) = 5 charecters
                prefixString = prefixString.substring(0, prefixString.length() - 1);
                
                if(prefixString.length() == 0){
                    return "";
                }
            }
        }
        
        return prefixString;
    }
}