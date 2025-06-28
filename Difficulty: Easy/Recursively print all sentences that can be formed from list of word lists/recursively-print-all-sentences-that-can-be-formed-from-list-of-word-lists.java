class Solution {
    
    public static void generate(String list[][], int row, ArrayList<String> curr, ArrayList<ArrayList<String>> res){
        if(row == list.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        for(int col=0; col<list[0].length; col++){
            curr.add(list[row][col]);
            generate(list, row+1, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
    public static ArrayList<ArrayList<String>> sentences(String[][] list) {
        // code here
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        ArrayList<String> curr = new ArrayList<>();
        
        generate(list, 0, curr, res);
        
        return res;
    }
}
