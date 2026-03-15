// User function Template for Java

class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        for(int i : arr){
            if(!set.contains(i)) set.add(i);
        }
        
        return new ArrayList<>(set);
    }
}