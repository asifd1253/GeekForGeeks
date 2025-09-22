class Solution {
    public int maxPartitions(String s) {
        // code here
        int arr[] = new int[26];
        
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a'] = i;
        }
        
        int totalParti = 0;
        int maxLast = 0;
        
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i)-'a';
            maxLast = Math.max(maxLast, arr[idx]);
            
            if(maxLast == i){
                totalParti++;
            }
        }
        
        return totalParti;
    }
}