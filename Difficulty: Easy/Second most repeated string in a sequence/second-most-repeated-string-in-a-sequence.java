// User function Template for Java

class Solution {
    String secFrequent(String arr[], int N) {
        // your code here
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String str : arr){
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        
        int firFreq = 0;
        int secFreq = 0;
        
        String str1 = "";
        String str2 = "";
        
        for(String str : arr){
            int curFreq = map.get(str);
            
            if(firFreq < curFreq){
                secFreq = firFreq;
                str2 = str1;
                
                firFreq = curFreq;
                str1 = str;
            }else if(firFreq > curFreq && secFreq < curFreq){
                secFreq = curFreq;
                str2 = str;
            }
        }
       
        return str2;
    }
}