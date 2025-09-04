// User function Template for Java
class StackQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    public void push(int data) {
        // code here
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        
        s1.push(data);
        
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int pop() {

        return s1.isEmpty()?-1:s1.pop();
        // code here
    }
}