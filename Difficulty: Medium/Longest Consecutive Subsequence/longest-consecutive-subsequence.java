class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : arr){
            set.add(i);
        }
        
        int maxLen = 0;
        
        for(int num : set){
            if(!set.contains(num-1)){
                 int max = 1;
                 while(set.contains(num+1)){
                     max++;
                     num++;
                 }
                 maxLen = Math.max(max, maxLen);
            }
        }
        
        return maxLen;
    }
}