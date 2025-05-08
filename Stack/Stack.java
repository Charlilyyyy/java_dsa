package Stack;

import Queue.QueueNode;

public class Stack {
    StackNode root;

    public void push(int data){
        StackNode newNode = new StackNode(data);
        if(root == null) {
            root = newNode;
        } else {
            newNode.next = root;
            root = newNode;
        }
    }

    public int pop(){
        if (root == null) {
            throw new Error("Stack is empty");
        }
        int firstData = root.data;
        root = root.next;
        return firstData;
    }

    public static void printStack(Stack stack){
        StackNode current = stack.root;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push(3);
        stack1.push(5);
        stack1.push(399);
        stack1.push(8);
        stack1.pop();
        printStack(stack1);
    }
}
