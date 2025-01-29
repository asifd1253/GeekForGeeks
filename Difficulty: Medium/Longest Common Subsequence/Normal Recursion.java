
class Solution {
    public static int helper(String s1, String s2, int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }
        
        //case- 1:
                    //-1 because index 0
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return helper(s1, s2, n-1, m-1)+1;
        }else{   //diff
            int ans1 = helper(s1, s2, n, m-1);
            int ans2 = helper(s1, s2, n-1, m);
            return Math.max(ans1, ans2);
        }
    }
    // Function to find the length of the longest common subsequence in two strings.
    static int lcs(String s1, String s2) {
        // your code here
        return helper(s1,s2,s1.length(),s2.length());
    }
}
