class Solution {
    public static int solve(int n, String s) {
        // code here
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> rejPersons = new HashSet<>();
        
        int totCom = n;
        int res = 0;
        
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                totCom++;
            }else if(rejPersons.contains(s.charAt(i))){
                continue;
            }else {
                if(totCom > 0){
                    set.add(s.charAt(i));
                    totCom--;
                }else{
                    rejPersons.add(s.charAt(i));
                    res++;
                }
            }
        }
        
        return res;
    }
}
