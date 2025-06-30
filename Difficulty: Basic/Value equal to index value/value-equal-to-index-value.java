// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> arr) {
        // code here
        List<Integer> res = new ArrayList<>();
        
        for(int i=1; i<=arr.size(); i++){
            if(arr.get(i-1) == i){
                res.add(i);
            }
        }
        
        return res;
    }
}