/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        boolean res = true;
        
        for(int i : arr){
            String s = Integer.toString(i);
            
            int left = 0;
            int right = s.length()-1;
            
            while(left < right){
                if(s.charAt(left) != s.charAt(right)) return false;
                
                left++;
                right--;
            }
        }
        
        return res;
    }
}