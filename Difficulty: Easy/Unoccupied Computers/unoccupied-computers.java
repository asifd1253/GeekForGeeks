class Solution {
    public static int solve(int n, String s) {
        // code here
        HashSet<Character> comAlloted = new HashSet<>();
        HashSet<Character> rejectPersons = new HashSet<>();
        
        int res = 0;
        int totalCom = n;
        
        for(char ch : s.toCharArray()){
            if(comAlloted.contains(ch)){
                comAlloted.remove(ch);
                totalCom++;
            }else if(rejectPersons.contains(ch)){
                rejectPersons.remove(ch);
            }else{
                if(totalCom > 0){
                    comAlloted.add(ch);
                    totalCom--;
                }else{
                    rejectPersons.add(ch);
                    res++;
                }
            }
        }
        
        return res;
    }
}
