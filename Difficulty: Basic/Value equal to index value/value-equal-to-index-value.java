// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        List<Integer> res = new ArrayList<>();
        
        for(int i=1; i<=nums.size(); i++){
            int curEle = nums.get(i-1);
            if(curEle == i) res.add(i);
        }
        
        return res;
    }
}