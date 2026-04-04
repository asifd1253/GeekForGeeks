// User function Template for Java
class helper{
    
}
class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
            list.add(i);
        }
        
        Collections.sort(list, (a,b)->{
            int freqA = map.get(a);
            int freqB = map.get(b);
            
            if(freqA != freqB) return freqB - freqA;
            
            return a-b;
        });
        
        return list;
        
      
    }
}