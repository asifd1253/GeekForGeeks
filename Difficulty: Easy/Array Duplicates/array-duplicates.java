class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                list.add(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
        
        return list;
    }
}