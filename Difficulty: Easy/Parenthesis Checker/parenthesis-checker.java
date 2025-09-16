class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char curChar = s.charAt(i);
            
            if(curChar == '(' || curChar == '[' || curChar == '{'){
                st.push(curChar);
            }else if(st.isEmpty()){
                return false;
            }else {
                if(curChar == ')' && st.peek() == '('){
                    st.pop();
                }else if(curChar == '}' && st.peek() == '{'){
                    st.pop();
                }else if(curChar == ']' && st.peek() == '['){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        
        return st.isEmpty()?true:false;
    }
}
