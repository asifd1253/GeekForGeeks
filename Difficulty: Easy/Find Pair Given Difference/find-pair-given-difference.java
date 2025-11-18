
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        
        int i=0;
        int j=1;
        
        while(i<arr.length && j<arr.length){
            int diff = arr[j] - arr[i];
            if(i != j && diff == x){
                return true;
            }else if(diff < x){
                j++;
            }else{
                i++;
            }
        }
        
        return false;
    }
}