class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        
        int temp[] = new int[n];
        
        // temp[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        // st.push(arr[n-1]);
        
        for(int i=n-1; i>=0; i--){
            int curEle = arr[i];
            
            while(!st.isEmpty() && st.peek() <= curEle){
                st.pop();
            }
            
            if(st.isEmpty()){
                temp[i] = -1;
            }else if(curEle < st.peek()){
                temp[i] = st.peek();
            }
            st.push(curEle);
        }
        
        for(int i : temp){
            res.add(i);
        }
        
        return res;
    }
}
