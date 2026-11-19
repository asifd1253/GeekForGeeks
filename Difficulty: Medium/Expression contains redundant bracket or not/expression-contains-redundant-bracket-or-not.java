class Solution {
	public boolean checkRedundancy(String s) {
		// code here
		Stack<Character> st = new Stack<>();
		
		for (char ch: s.toCharArray()) {
			
			if (
			ch == '(' ||
			ch == '+' ||
			ch == '-' ||
			ch == '*' ||
			ch == '/'
			) {
				st.push(ch);
			} else if (ch == ')') {
			    
			    boolean hasOperator = false;
				while (!st.isEmpty() && st.peek() != '(') {
					char curPop = st.pop();
					
					if (
					curPop == '+' ||
					curPop == '-' ||
					curPop == '*' ||
					curPop == '/'
					) {
						hasOperator = true;
					}
				}
				
				if (hasOperator == false) {
					return true;
				}
				
				if (!st.isEmpty() && st.peek() == '(') {
					st.pop();
				}
			}
		}
		
		return false;
	}
}
