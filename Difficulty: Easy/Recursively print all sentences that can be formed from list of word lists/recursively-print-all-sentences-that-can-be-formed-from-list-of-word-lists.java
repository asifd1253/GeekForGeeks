class Solution {
    static void generate(String list[][], ArrayList<ArrayList<String>> res, ArrayList<String> temp, int row){
        if(row == list.length){
            res.add(new ArrayList<>(temp));
            return;
        }
  
        for(int col=0; col<list[0].length; col++){
            temp.add(list[row][col]);
            generate(list, res, temp, row+1);
            temp.remove(temp.size() - 1);
        }
    }
    public static ArrayList<ArrayList<String>> sentences(String[][] list) {
        // code here
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
           
        generate(list, res, temp, 0);
        
        return res;
    }
}
