// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        LinkedList<Integer> set1 = new LinkedList<>();
        LinkedList<Integer> set2 = new LinkedList<>();
        
        for(int i=0; i<arr.size(); i++){
            int curEle = arr.get(i);
            
            if(curEle < 0){
                set2.add(curEle);
            }else{
                set1.add(curEle);
            }
        }
        
        
        Iterator<Integer> posIter = set1.iterator();
        Iterator<Integer> negIter = set2.iterator();
        for(int i=0; i<arr.size(); i++){
            if(i%2 == 0 && posIter.hasNext()){
                arr.set(i, posIter.next());
            }else if(i%2 != 0 && negIter.hasNext()){
                arr.set(i, negIter.next());
            }else if(posIter.hasNext()){
                arr.set(i, posIter.next());
            }else if(negIter.hasNext()){
                arr.set(i, negIter.next());
            }
        }
    }
}