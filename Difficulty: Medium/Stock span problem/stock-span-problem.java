
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        Stack<Integer> st = new Stack<>();
        
        res.add(1);
        st.push(0);
        
        for(int i=1; i<arr.length; i++){
            int curPrice = arr[i];
            
            while(!st.isEmpty() && arr[st.peek()] <= curPrice){
                st.pop();
            }
            
            if(st.isEmpty()){
                res.add(i+1);
            }else{
                res.add(i - st.peek());
            }
            
            st.push(i);
        }
        
        return res;
    }
}