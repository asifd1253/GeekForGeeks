class Solution {
    public boolean wildCard(String txt, String pat) {
        // Your code goes here
        int n = txt.length();
        int m = pat.length();
        boolean dp[][] = new boolean[n+1][m+1];
        
        dp[0][0] = true;
        
        for(int i=1; i<dp.length; i++){      //rows
            dp[i][0] = false;
        }
        
        for(int j=1; j<dp[0].length; j++){      //cols
            if(pat.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }
        
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(txt.charAt(i-1) == pat.charAt(j-1) || pat.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }else if(pat.charAt(j-1) == '*'){
                    //refer notes for better understanding
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }else{
                    dp[i][j] = false;
                }
            }
        }
        
        return dp[n][m];
    }
}
