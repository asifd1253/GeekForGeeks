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
                //currentCard + i
                int currentCard = firstCard + i;
                if(!map.containsKey(currentCard)){
                    return false;
                }
                map.put(currentCard, map.get(currentCard)-1);
                if(map.get(currentCard) == 0){
                    map.remove(currentCard);
                }
            }
        }
        
        return true;
    }
}
