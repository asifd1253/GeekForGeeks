// User function Template for Java

// arr[] : int input array of integers
// target : the quadruple sum required

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        Set<ArrayList<Integer>> res = new LinkedHashSet<>();
        
        for(int i=0; i<arr.length-3; i++){
            for(int j=i+1; j<arr.length-2; j++){
                int l=j+1;
                int r=arr.length-1;
                
                while(l < r){
                    int sum = arr[i]+arr[j]+arr[l]+arr[r];
                    if(sum == target){
                        ArrayList<Integer> inArr = new ArrayList<>();
                        inArr.add(arr[i]);
                        inArr.add(arr[j]);
                        inArr.add(arr[l]);
                        inArr.add(arr[r]);
                        res.add(inArr);
                        l++;
                        r--;
                    }else if(sum > target){
                        r--;
                    }else{
                        l++;
                    }
                }
            }
        }
        
        return new ArrayList<>(res);
    }
}