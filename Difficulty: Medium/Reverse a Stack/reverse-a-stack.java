
class Solution {
    static void insertAtBottom(Stack<Integer> st, int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        
        int top = st.pop();
        insertAtBottom(st, ele);
        st.push(top);
    }
    static void reverse(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
        
        int temp = st.pop();
        reverse(st);
        insertAtBottom(st, temp);
    }
}