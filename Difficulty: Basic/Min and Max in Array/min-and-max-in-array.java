class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> res = new ArrayList<>();
        
        Arrays.sort(arr);
        
        res.add(arr[0]);
        res.add(arr[arr.length-1]);
        
        return res;
    }
}
