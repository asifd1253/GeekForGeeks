class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String, ArrayList<String>> anagramMap = new HashMap<>();
        
        for(String word : arr){
            char letters[] = word.toCharArray();
            Arrays.sort(letters);
            
            String sortedStr = new String(letters);
            
            if(!anagramMap.containsKey(sortedStr)){
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            
            anagramMap.get(sortedStr).add(word);
        }
        
        
        return new ArrayList<>(anagramMap.values());
    }
}
