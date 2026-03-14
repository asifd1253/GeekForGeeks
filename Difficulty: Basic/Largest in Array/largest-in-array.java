class Solution {
    public static int largest(int[] arr) {
        // code here
        int res = Integer.MIN_VALUE;
        
        for(int i : arr){
            if(i > res){
                res = i;
            }
        }
        
        return res;
    }
}
