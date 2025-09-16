class Solution {
    
    ArrayList<String> backtrack(char arr[], ArrayList<String> res, StringBuilder sb, boolean usedChar[]){
        if(arr.length == sb.length()){
            res.add(sb.toString());
            return res;
        }
        
        for(int i=0; i<arr.length; i++){
            if(usedChar[i]){
                continue;
            }
            
            if(i > 0 && arr[i] == arr[i-1] && !usedChar[i-1]){
                continue;
            }
            
            usedChar[i] = true;
            sb.append(arr[i]);
            
            backtrack(arr, res, sb, usedChar);
            
            sb.deleteCharAt(sb.length()-1);
            usedChar[i] = false;
        }
        
        return res;
    }
    
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> res = new ArrayList<>();
        
        char arr[] = s.toCharArray();
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        
        boolean usedChar[] = new boolean[s.length()];
        
        return backtrack(arr, res, sb, usedChar);
    }
}