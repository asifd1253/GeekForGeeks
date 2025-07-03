// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> res = new ArrayList<>();
        
        int i=0, j=0, k=0;
        
        while(i < arr1.size() && j < arr2.size() && k < arr3.size()){
            if(arr1.get(i).equals(arr2.get(j)) && arr2.get(j).equals(arr3.get(k))){
                if(res.isEmpty() || !res.get(res.size()-1).equals(arr1.get(i))){
                    res.add(arr1.get(i));
                    while(i+1 < arr1.size() && arr1.get(i).equals(arr1.get(i+1))) i++;
                    while(j+1 < arr2.size() && arr2.get(j).equals(arr2.get(j+1))) j++;
                    while(k+1 < arr3.size() && arr3.get(k).equals(arr3.get(k+1))) k++;
                    
                    i++;
                    j++;
                    k++;
                }
            }else if(arr1.get(i) < arr2.get(j)){
                i++;
            }else if(arr2.get(j) < arr3.get(k)){
                j++;
            }else{
                k++;
            }
        }
        
        if(res.isEmpty()){
            res.add(-1);
        }
        return res;
    }
}