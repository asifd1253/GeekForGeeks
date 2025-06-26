// User function Template for Java

class Solution {
    int transform(String A, String B) {
        // code here
        int n = A.length();
        int m = B.length();
        
        if(n != m){
            return -1;
        }
        
        int freq[] = new int[256];
        
        for(int i=0; i<n; i++){
            freq[A.charAt(i)]++;
            freq[B.charAt(i)]--;
        }
        
        for(int count : freq){
            if(count != 0){
                return -1;
            }
        }
        
        int p1 = n-1;
        int p2 = m-1;
        int steps = 0;
        
        while(p1 >= 0){
            if(A.charAt(p1) == B.charAt(p2)){
                p2--;
            }else{
                steps++;
            }
            p1--;
        }
        return steps;
    }
}