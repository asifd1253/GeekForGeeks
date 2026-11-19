class Solution {
    static String decodedString(String s) {
        // code here
        Stack<Integer> numStack=new Stack<>();
        Stack<String> charStack=new Stack<>();
        int curNum=0;
        
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                curNum = curNum*10 + (ch - '0');
            }else if(ch == '['){
                numStack.push(curNum);
                curNum=0;
                charStack.push(Character.toString(ch));
            }else if(ch == ']'){
                String decoded="";
                while(!charStack.isEmpty() && !charStack.peek().equals("[")){
                    decoded = charStack.pop() + decoded;
                }
                
                charStack.pop();
                
                String temp = "";
                int times = 0;
                if(!numStack.isEmpty()){
                    times = numStack.pop();
                }
                
                for(int i=0; i<times; i++){
                    temp = temp + decoded;
                }
                charStack.push(temp);
            }else{
                charStack.push(Character.toString(ch));
            }
        }
        
        String res="";
        while(!charStack.isEmpty()){
            res = charStack.pop() + res;
        }
        
        return res;
    }
}
