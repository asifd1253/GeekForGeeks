// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> posArr = new ArrayList<>();
        ArrayList<Integer> negArr = new ArrayList<>();
        
        for(int i : arr){
            if(i < 0){
                negArr.add(i);
            }else{
                posArr.add(i);
            }
        }
        
        int i=0;
        int j=0;
        
        int idx = 0;
        
        while(i<posArr.size() && j<negArr.size()){
            if(idx % 2 == 0){
                arr.set(idx, posArr.get(i));
                i++;
            }else{
                arr.set(idx, negArr.get(j));
                j++;
            }
            
            idx++;
            
        }
        
        while(i<posArr.size()){
            arr.set(idx, posArr.get(i));
            idx++;
            i++;
        }
        while(j<negArr.size()){
            arr.set(idx, negArr.get(j));
            idx++;
            j++;
        }
    }
}