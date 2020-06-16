package DataStructures;

import Problems.ArrayBasedStack;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(20);
		stack.push(50);
		
		System.out.println("The size of Stack is " + stack.getSize());
		stack.traceStack();
		
		System.out.println("The poped data " + stack.pop());
		System.out.println("The poped data " + stack.pop());
		
		System.out.println("The top is " +  stack.peek());
		
		System.out.println("The size of Stack is " + stack.getSize());
		stack.traceStack();
		
		System.out.println("The poped data " + stack.pop());
		System.out.println("The poped data " + stack.pop());
		
		stack.traceStack();
		stack.peek();
		
		System.out.println();
		Stack stack1 = new Stack();
		
		stack1.push(100);
		stack1.push(200);
		stack1.push(300);
		stack1.push(400);
		stack1.push(500);
		
		stack1.traceStack();
		System.out.println("Size of stack2 is " + stack1.getSize());
		System.out.println("Top of stack2 is " + stack1.peek());
		
		System.out.println();
		MyStack myStack = new MyStack();
		myStack.push(10);
		myStack.push(20);
		myStack.push(5);
		myStack.push(5);
		
		System.out.println("Minimum number in stack is " + myStack.showMinimum());
		myStack.showMinStack();
		
		System.out.println("1st pop " + myStack.pop());
		System.out.println("2nd pop " + myStack.pop());
		System.out.println("3rd pop " + myStack.pop());
		System.out.println("4th pop " + myStack.pop());
		
		System.out.println("Minimum number in stack is " + myStack.showMinimum());
		myStack.showMinStack();
		myStack.showGeneralStack();*/
		
		ArrayBasedStack stack = new ArrayBasedStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		stack.push(110);
		stack.push(120);
		stack.push(130);
		
		stack.printStack();
		
		System.out.println("Popped data " + stack.pop());
		System.out.println("popped data " + stack.pop());
		System.out.println("Popped data " + stack.pop());
		System.out.println("popped data " + stack.pop());
		System.out.println("Popped data " + stack.pop());
		System.out.println("popped data " + stack.pop());
		
		
		stack.printStack();
		

	}
}
