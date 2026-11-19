class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        Queue<Integer> q=new LinkedList<>();
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        while(!q.isEmpty()){
            st.push(q.remove());
        }
    }
}
