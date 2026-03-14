class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        
        for(int i : arr){
            if(i > fmax){
                smax = fmax;
                fmax = i;
            }else if(i != fmax && i > smax){
                smax = i;
            }
        }
        
        return smax == Integer.MIN_VALUE ? -1 : smax;
    }
}