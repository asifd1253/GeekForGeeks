class Solution {
    public static int solve(int n, String s) {
        // code here
        HashSet<Character> comAllotedPerson = new HashSet<>();
        int totCom = n;
        
        int res = 0;
        HashSet<Character> comRejectedPerson = new HashSet<>();
        
        for(char c : s.toCharArray()){
            if(comAllotedPerson.contains(c)){
                comAllotedPerson.remove(c);
                totCom++;
            }else if(comRejectedPerson.contains(c)){
                comRejectedPerson.remove(c);
            }else if(totCom > 0){
                comAllotedPerson.add(c);
                totCom--;
            }else{
                comRejectedPerson.add(c);
                res++;
            }
        }
        
        return res;
    }
}
