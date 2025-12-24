class Solution {
    
    ArrayList<String> generatePermutation(ArrayList<String> res, char arr[], StringBuilder sb, boolean usedChar[]){
        if(sb.length() == arr.length){
            res.add(sb.toString());
            return res;
        }
        
        for(int i=0; i<arr.length; i++){
            if(usedChar[i]) continue;
            
            if(i>0 && arr[i]==arr[i-1] && !usedChar[i-1]) continue;
            
            usedChar[i] = true;
            sb.append(arr[i]);
            
            generatePermutation(res, arr, sb, usedChar);
            
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
        
        boolean usedChar[] = new boolean[arr.length];
        
        return generatePermutation(res, arr, sb, usedChar);
    }
}