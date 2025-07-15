class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        for(int c=0; c<mat[0].length; c++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int r=0; r<mat.length; r++){
                temp.add(mat[r][c]);
            }
            res.add(new ArrayList<>(temp));
        }
        
        return res;
    }
}