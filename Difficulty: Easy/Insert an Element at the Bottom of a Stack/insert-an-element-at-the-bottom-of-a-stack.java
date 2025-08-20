// User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        if(st.isEmpty()){
            st.push(x);
            return st;
        }
        int cur = st.pop();
        insertAtBottom(st, x);
        st.push(cur);
        return st;
    }
}