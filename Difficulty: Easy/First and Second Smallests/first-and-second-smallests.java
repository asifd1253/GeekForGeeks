class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        // Arrays.sort(arr);
        
        // ArrayList<Integer> res = new ArrayList<>();
        
        // for(int i : arr){
        //     if(!res.contains(i) && res.size() < 2){
        //         res.add(i);
        //     }
        // }
        
        // if(res.size() == 1){
        //     res.set(0, -1);
        // }
        
        // return res;
        
        ArrayList<Integer> res = new ArrayList<>();
        
        if (arr.length < 2) {
            res.add(-1);
            return res;
        }
        
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        
        // Find min and second min in single pass
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        
        if (secondMin == Integer.MAX_VALUE) {
            res.add(-1);
        } else {
            res.add(min);
            res.add(secondMin);
        }
        
        return res;
    }
}
