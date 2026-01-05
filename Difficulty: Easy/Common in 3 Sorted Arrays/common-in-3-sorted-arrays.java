// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        ArrayList<Integer> res = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr1.size(); i++){
            if(i>0 && arr1.get(i) == arr1.get(i-1)) continue;
            int val = arr1.get(i);
            map.put(val, 1);
        }
        for(int i=0; i<arr2.size(); i++){
            if(i>0 && arr2.get(i) == arr2.get(i-1)) continue;
            int val = arr2.get(i);
            
            if(map.containsKey(val) && map.get(val) == 1) map.put(val, 2);
        }
        for(int i=0; i<arr3.size(); i++){
            if(i>0 && arr3.get(i) == arr3.get(i-1)) continue;
            int val = arr3.get(i);
            
            if(map.containsKey(val) && map.get(val) == 2) map.put(val, 3);
        }
        
        
        for(int key : map.keySet()){
            if(map.get(key) == 3){
                res.add(key);
            }
        }
        Collections.sort(res);
        return res;
    }
}