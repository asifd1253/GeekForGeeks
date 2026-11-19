class Solution {
	public boolean checkRedundancy(String s) {
		// code here
		Stack<Character> st = new Stack<>();
		
		for (char ch: s.toCharArray()) {
			boolean isRedundant = true;
			
			if (
			ch == '(' ||
			ch == '+' ||
			ch == '-' ||
			ch == '*' ||
			ch == '/'
			) {
				st.push(ch);
			}else if(ch==')'){
			    while(!st.isEmpty() && st.peek() != '('){
			        char curPop = st.pop();
			        
			        if(
			            curPop == '+' ||
			            curPop == '-' ||
			            curPop == '*' ||
			            curPop == '/' 
			            ){
			                isRedundant=false;
			            }
			    }
			    
			    if(isRedundant){
			        return true;
			    }
			    
			    if(!st.isEmpty() && st.peek() == '('){
			        st.pop();
			    }
			}
		}
		
		return false;
	}
}
