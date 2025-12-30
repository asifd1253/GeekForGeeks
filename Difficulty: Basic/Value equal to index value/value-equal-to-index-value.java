// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == i+1){
                res.add(arr.get(i));
            }
        }
        
        return res;
    }
}