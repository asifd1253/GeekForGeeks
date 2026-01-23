// User function Template for Java

class Solution {
    public int findSubString(String str) {
        // code here
        HashSet<Character> set = new HashSet<>();
        
        for(char c : str.toCharArray()){
            set.add(c);
        }
        
        int setSize = set.size();
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int i=0;
        int j=0;
        
        int ans = str.length();
        
        while(i < str.length()){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
            
            while(map.size() == setSize){
                ans = Math.min(ans, i-j+1);
                char c2 = str.charAt(j);
              
                map.put(c2, map.get(c2)-1);
                
                if(map.get(c2) == 0) map.remove(c2);
                
                j++;
            }
            i++;
        }
        
        return ans;
        
    }
}