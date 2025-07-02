// User function Template for Java

class Solution {
    public static void helper(int n, String curStr, int prevBit, List<String> result){
        if(n == 0){
            result.add(curStr);
            return ;
        }
        
        helper(n-1, curStr+"0", 0, result);
        
        if(prevBit == 0){
            helper(n-1, curStr+"1", 1, result);
        }
    }
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> result = new ArrayList<>();
        
        helper(n, "", 0, result);
        
        return result;
    }
}
