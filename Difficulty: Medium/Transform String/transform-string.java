// User function Template for Java

class Solution {
    int transform(String A, String B) {
        // code here
        int p1=A.length()-1;
        int p2=B.length()-1;
        
        if(p1 != p2){
            return -1;
        }
        
        int charFreq[] = new int[256];
        
        for(int i=0; i<A.length(); i++){
            charFreq[A.charAt(i)]++;
            charFreq[B.charAt(i)]--;
        }
        
        for(int count : charFreq){
            if(count != 0){
                return -1;
            }
        }
        
        int operations = 0;
        
        while(p1 >= 0){
            char c1 = A.charAt(p1);
            char c2 = B.charAt(p2);
            
            if(c1 == c2){
               p2--;
            }else{
                operations++;
            }
            
            p1--;
        }
        
        return operations;
    }
}