// User function Template for Java

class Solution {
    static boolean isStraightHand(int N, int groupSize, int hand[]) {
        // code here
        if(hand.length % groupSize != 0){
            return false;
        }
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i : hand){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        while(!map.isEmpty()){
            int firstCard = map.firstKey();
            
            for(int i=0; i<groupSize; i++){
                int nextCard = firstCard + i;
                
                if(!map.containsKey(nextCard)){
                    return false;
                }
                
                map.put(nextCard, map.get(nextCard)-1);
                
                if(map.get(nextCard) == 0){
                    map.remove(nextCard);
                }
            }
        }
        
        return true;
    }
}
