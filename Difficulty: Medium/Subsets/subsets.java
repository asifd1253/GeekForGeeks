class Solution {
    public void backtrack(int idx, int arr[], ArrayList<Integer> curArr, ArrayList<ArrayList<Integer>> res){
        res.add(new ArrayList<>(curArr));
        
        for(int i=idx; i<arr.length; i++){
            curArr.add(arr[i]);
            backtrack(i+1, arr, curArr, res);
            curArr.remove(curArr.size()-1);
        }
        
    }
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        
        ArrayList<Integer> curArr=new ArrayList<>();
        backtrack(0, arr, curArr, res);
        
        return res;
    }
}