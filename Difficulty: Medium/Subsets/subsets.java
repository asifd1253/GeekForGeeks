// User function Template for Java

class Solution {
    public void backtrack(int idx, int arr[], ArrayList<Integer> currList, ArrayList<ArrayList<Integer>> res){
        res.add(new ArrayList<>(currList));
        
        for(int i=idx; i<arr.length; i++){
            currList.add(arr[i]);
            backtrack(i+1, arr, currList, res);
            currList.remove(currList.size()-1);
        }
    }
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        backtrack(0, arr, new ArrayList<>(), res);
        
        return res;
    }
}