class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        boolean res = true;
        
        for(int num : arr){
            String ele = String.valueOf(num);
            int i=0;
            int j=ele.length()-1;
            
            while(i <= j){
                if(ele.charAt(i) != ele.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
        }
        
        return res;
    }
}
