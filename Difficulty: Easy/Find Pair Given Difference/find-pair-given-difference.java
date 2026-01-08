
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        
        int n = arr.length;
        
        int i = 0;
        int j = 1;
        
        while(i< n && j < n){
            int curDiff = arr[j]-arr[i];
            
            if(i != j && curDiff == x){
                return true;
            }else if(curDiff < x){
                j++;
            }else{
                i++;
            }
         
        }
        
        return false;
    }
}
