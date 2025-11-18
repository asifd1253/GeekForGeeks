class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        // ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Set<ArrayList<Integer>> res = new LinkedHashSet<>();
        
        for(int i=0; i<arr.length-3; i++){
            for(int j=i+1; j<arr.length-2; j++){
                int l = j+1;
                int r = arr.length-1;
                
                while(l < r){
                    int curSum = arr[i]+arr[j]+arr[l]+arr[r];
                    if(curSum == target){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[l]);
                        temp.add(arr[r]);
                        
                        res.add(temp);
                        
                        l++;
                        r--;
                    }else if(curSum < target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}