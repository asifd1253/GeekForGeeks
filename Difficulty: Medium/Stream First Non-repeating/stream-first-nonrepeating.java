class Solution {
    public String FirstNonRepeating(String s) {
        // code here
        Queue<Character> q = new LinkedList<>();
        int map[] = new int[26];
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            q.add(ch);
            map[ch-'a']++;
            
            while(!q.isEmpty() && map[q.peek()-'a'] > 1){
                q.remove();
            }
            
            if(q.isEmpty()){
                sb.append('#');
            }else{
                sb.append(q.peek());
            }
        }
        
        return sb.toString();
    }
}