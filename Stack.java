public class Stack {
    int[] stackArray;
    int maxSize;
    int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value + " onto the stack.");
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " onto the stack.");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop from an empty stack.");
            return -1;
        }
        int value = stackArray[top--];
        System.out.println("Popped " + value + " from the stack.");
        return value;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Current top of the stack: " + stack.pop());
        System.out.println("Current top of the stack: " + stack.pop());
        System.out.println("Current top of the stack: " + stack.pop());
        System.out.println("Current top of the stack: " + stack.pop());
        System.out.println("\n Developed by CHIRAG PABARI");
    }
}