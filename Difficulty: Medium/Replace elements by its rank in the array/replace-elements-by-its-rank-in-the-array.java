// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        int temp[] = new int[N];
        
        int idx = 0;
        for(int i : arr){
            temp[idx++] = i;
        }
        
        Arrays.sort(temp);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int counter = 0;
        for(int i : temp){
            if(!map.containsKey(i)){
                map.put(i, ++counter);
            }
        }
        
        int idx1 = 0;
        int res[] = new int[arr.length];
        for(int i : arr){
            res[idx1++] = map.get(i);
        }
        
        return res;
    }
}
