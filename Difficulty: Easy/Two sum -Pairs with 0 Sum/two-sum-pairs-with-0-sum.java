// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        int i = 0;
        int j = arr.length-1;
        
        while(i < j){
            int curSum = arr[i]+arr[j];
            
            if(curSum == 0){
                ArrayList<Integer> temp = new ArrayList<>();
                
                temp.add(arr[i]);
                temp.add(arr[j]);
                
                res.add(temp);
                
                while(i < j && arr[i] == arr[i+1]){
                    i++;
                }
                
                while(i < j && arr[j] == arr[j-1]){
                    j--;
                }
                
                i++;
                j--;
            }else if(curSum < 0){
                i++;
            }else{
                j--;
            }
        }
        return res;
    }
}
