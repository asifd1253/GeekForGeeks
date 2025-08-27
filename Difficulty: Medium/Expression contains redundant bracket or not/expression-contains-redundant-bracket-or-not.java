class Solution {
    public static int checkRedundancy(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()){
            boolean isRedundant = true;
            
            if(ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                st.push(ch);
            }else if(ch == ')'){
                
                while(!st.isEmpty() && st.peek() != '('){
                    char cur = st.pop();
                    if(cur == '+' || cur == '-' || cur == '*' || cur == '/'){
                        isRedundant = false;
                    }
                }  
                
                if(isRedundant){
                    return 1;
                }
               
                if(!st.isEmpty() &&  st.peek() == '('){
                    st.pop();
                }
              
            }
        }
        
        return 0;
    }
}
