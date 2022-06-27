public class Queue{
    public static final int SIZE = 10;
    int queue[] = new int[SIZE];
    int front = -1, rear = -1;

    public boolean isEmpty(){
        if(front == -1 & rear == -1)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if(rear == SIZE-1)
            return true;
        else
            return false;
    }

    public boolean enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full. No more elements can be add the queue.");
            return false;
        }
        else if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else{
            rear++;
        }
        queue[rear] = element;
        return true;
    }

    public boolean dequeue(){
        if(isEmpty()){
            System.out.println("Queue is already empty. No more element can be remove from the queue.");
            return false;
        }
        else if(front == rear){
            front = -1;
            rear = -1;
        }
        else {
            front++;
        }
        return true;
    }

    public boolean printQueue(){
        int i;
        if(isEmpty()){
            return false;
        }
        else{
            for(i= front; i<=rear; i++){
                System.out.print(queue[i]+"<--");
            }
        }
        return true;
    }
    public void frontAndRearIndex(){
        System.out.println("\nFront index is: "+ front +"\nRear index is: "+ rear );
    }

    public static void main(String[] args){

        Queue q = new Queue();


        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(12);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.printQueue();
        q.frontAndRearIndex();
    }

}