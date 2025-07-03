// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        
        while(left < right){
            int sum = arr[left] + arr[right];
            
            if(sum == 0){
                ArrayList<Integer> in = new ArrayList<>();
                in.add(arr[left]);
                in.add(arr[right]);
                res.add(in);
                
                while(left < right && arr[left] == arr[left+1]){
                    left++;
                }
                while(left < right && arr[right] == arr[right-1]){
                    right--;
                }
                left++;
                right--;
            }else if(sum < 0){
                left++;
            }else{
                right--;
            }
        }
        
        return res;
    }
}
