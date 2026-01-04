// User function Template for Java
class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Add unique elements from arr1
        for (int i = 0; i < arr1.size(); i++) {
            if (i > 0 && arr1.get(i).equals(arr1.get(i - 1))) continue;
            map.put(arr1.get(i), 1);
        }

        // Step 2: For arr2 elements that exist in arr1, increment count
        for (int i = 0; i < arr2.size(); i++) {
            if (i > 0 && arr2.get(i).equals(arr2.get(i - 1))) continue;
            if (map.containsKey(arr2.get(i)) && map.get(arr2.get(i)) == 1) {
                map.put(arr2.get(i), 2);
            }
        }

        // Step 3: For arr3 elements that exist in both arr1 & arr2, increment count
        for (int i = 0; i < arr3.size(); i++) {
            if (i > 0 && arr3.get(i).equals(arr3.get(i - 1))) continue;
            if (map.containsKey(arr3.get(i)) && map.get(arr3.get(i)) == 2) {
                map.put(arr3.get(i), 3);
            }
        }

        // Step 4: Collect elements that appear in all three arrays
        for (int key : map.keySet()) {
            if (map.get(key) == 3) {
                res.add(key);
            }
        }

        Collections.sort(res);
        return res;
    }
}
