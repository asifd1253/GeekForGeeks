class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode head;

    // Function to push an integer into the stack.
    void push(int data) {
        // Add your code here
        StackNode newNode = new StackNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if(head == null){
            return -1;
        }
        
        StackNode temp = head;
        head = head.next;
        
        return temp.data;
    }
}