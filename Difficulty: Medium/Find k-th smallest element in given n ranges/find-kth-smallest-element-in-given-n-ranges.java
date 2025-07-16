class Solution {
    public static ArrayList<Integer> kthSmallestNum(int n, int[][] ranges, int q,
                                                    int[] queries) {
        // code here
        Arrays.sort(ranges, (a,b) -> Integer.compare(a[0], b[0]));
        
        ArrayList<int []> mergedRanges = new ArrayList<>();
        
        int mergedStart = ranges[0][0];
        int mergedEnd = ranges[0][1];
        
        for(int i=1; i<ranges.length; i++){
            int curStart = ranges[i][0];
            int curEnd = ranges[i][1];
            
            if(curStart - 1 <= mergedEnd){
                mergedEnd = Math.max(mergedEnd, curEnd);
            }else{
                mergedRanges.add(new int[]{mergedStart, mergedEnd});
                mergedStart = curStart;
                mergedEnd = curEnd;
            }
        }
        mergedRanges.add(new int[]{mergedStart, mergedEnd});
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int queryK : queries){
            int k = queryK;
            boolean found = false;
            
            for(int range[] : mergedRanges){
                int start = range[0];
                int end = range[1];
                int length = end - start +1;
                
                if(k <= length){
                    result.add(start + k - 1);
                    found = true;
                    break;
                }else{
                    k -= length;
                }
            }
            
            if(!found){
                result.add(-1);
            }
        }
        
        return result;
    }
}
