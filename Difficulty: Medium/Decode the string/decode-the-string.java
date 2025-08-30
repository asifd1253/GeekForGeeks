
class Solution {
    static String decodeString(String s) {
        // code here
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        
        int curNum = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                curNum = curNum * 10 + (ch - '0');
                continue;
            }
            
            if(ch == '['){
                numStack.push(curNum);
                curNum = 0;
                strStack.push(Character.toString(ch));
                continue;
            }
            
            
            if(ch == ']'){
                StringBuilder sb = new StringBuilder();
                
                while(!strStack.isEmpty() && !strStack.peek().equals("[")){
                    sb.insert(0, strStack.pop());
                }
                strStack.pop();
                
                int times = 0;
                if(!numStack.isEmpty()) times = numStack.pop();
                
                StringBuilder tempsb = new StringBuilder();
                for(int i=0; i<times; i++){
                    tempsb.append(sb.toString());
                }
                
                strStack.push(tempsb.toString());
            }else{   //remaining alphabets push into the stack
                strStack.push(Character.toString(ch));
            }
        }
        
        StringBuilder result = new StringBuilder();
        while(!strStack.isEmpty()){
            result.insert(0, strStack.pop());
        }
        
        return result.toString();
    }
}