// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int patFreq[] = new int[26];
        int txtFreq[] = new int[26];
        
        int k = pat.length();
        
        for(int i=0; i<k; i++){
            int patIdx = pat.charAt(i) - 'a';
            patFreq[patIdx]++;
            int txtIdx = txt.charAt(i) - 'a';
            txtFreq[txtIdx]++;
        }
        
        int count = 0;
        if(Arrays.equals(patFreq, txtFreq)) count++;
        
        int n = txt.length();
        for(int i=1; i<n-k+1; i++){
            int prevIdx = txt.charAt(i-1)-'a';
            int curIdx = txt.charAt(i+k-1)-'a';
            txtFreq[prevIdx]--;
            txtFreq[curIdx]++;
            if(Arrays.equals(patFreq, txtFreq)) count++;
        }
        
        return count;
    }
}