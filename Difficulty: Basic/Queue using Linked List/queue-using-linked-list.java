/*
class QueueNode
{
    int data;
    QueueNode next;
    QueueNode(int a)
    {
        data = a;
        next = null;
    }
}
*/

class MyQueue {
    QueueNode front, rear;

    // Function to push an element into the queue.
    void push(int data) {
        // code here
        if(front == null){
            front = new QueueNode(data);
            rear = front;
            return;
        }
        QueueNode newNode = new QueueNode(data);
        rear.next = newNode;
        rear = newNode;
        
    }

    // Function to pop front element from the queue
    int pop() {
        if(front == null){
            return -1;
        }
        int val = front.data;
        front = front.next;
        return val;
    }
}