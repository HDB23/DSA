public class Stack_Using_Java
{
    private int arr[];

    private int maxSize;

    private int top;

    public Stack_Using_Java(int cap)
    {
        maxSize = cap;
        arr = new int[cap];
        top = -1;
    }

    // Push Operation
    void push(int x){
        if(top == maxSize - 1){
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = x;
    }

    // Pop Operation
    int pop(){
        if(top == -1){
            System.out.println("Stack Overflow");
            return -1;
        }

        return arr[top--];
    }

    // Peek Operation
    int peek(){
        if(top == -1){
            System.out.println("Stack Overflow");
            return -1;
        }

        return arr[top];
    }

    //isEmpty Operation
    boolean isEmpty(){
        return top == -1;
    }

    // isFull Operation
    boolean isFull(){
        return top == maxSize - 1;
    }

    // Print Stack Opertion
    void printStack(){
        System.out.print("Stack : ");
        for(int i=maxSize-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Stack_Using_Java st = new Stack_Using_Java(4);

        // Pushing Elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // Displaying Stack Element
        st.printStack();

        // Poping Element
        System.out.println("\nPopped : " + st.pop());

        // Checking top element
        System.out.println("Top : " + st.peek());

        // Checking if stack is empty
        System.out.println("Is Empty : " + st.isEmpty());

        // Checking if stack is full
        System.out.println("Is Full : " + st.isFull());
    }
}


