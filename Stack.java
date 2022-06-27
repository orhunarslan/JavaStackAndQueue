public class Stack {
    public static final int MAX_STACK_SIZE = 10;
    int top = -1;
    String[] stack = new String[MAX_STACK_SIZE];

    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if(top == MAX_STACK_SIZE-1)
            return true;
        else
            return false;
    }

    public boolean push(String newElement){
        if(isFull()){
            System.out.println("Stack is full.");
            return false;
        }
        else{
            top++;
            stack[top] = newElement;
            return true;
        }
    }

    public boolean pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return false;
        }
        else{
            stack[top] = null;
            top--;
            return true;
        }
    }

    public void clear(){
        top = -1;
        for(int i=0; i<MAX_STACK_SIZE; i++){
            stack[i] = null;
        }
    }

    public int getCapacity(){
        return MAX_STACK_SIZE;
    }

    public void showElements(){
        int i;
        for(i=0; i<MAX_STACK_SIZE; i++){
            if(stack[i]!=null)
                System.out.println(stack[i]+" ");
        }
    }

    public static void main(String[] args){

        Stack stack = new Stack();

        stack.push("A");
        stack.push("B");
        stack.pop();
        stack.push("C");
        stack.push("D");
        stack.clear();
        stack.push("D");
        stack.push("D");
        stack.showElements();

    }
}
