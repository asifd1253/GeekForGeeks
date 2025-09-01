class MyQueue {

    int front, rear;
    int arr[];
    int capacity;
    int size;

    MyQueue() {
        capacity = 100005;
        front = 0;
        rear = 0;
        arr = new int[capacity];
        size = 0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        // Your code here
        if(size == capacity){
            return;
        }
        arr[rear] = x;
        
        rear = (rear+1)%capacity;
        size++;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        
        // Your code here
        if(size == 0){
            return -1;
        }
        int val = arr[front];
        
        front = (front + 1)%capacity;
        size--;
        return val;
    }
}