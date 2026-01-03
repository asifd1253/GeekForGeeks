class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        for(char c : s2.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.getOrDefault(c, 0)-1);
                
                if(map.get(c) == 0) map.remove(c);
            }else{
                return false;
            }
        }
        
        return true;
    }
}