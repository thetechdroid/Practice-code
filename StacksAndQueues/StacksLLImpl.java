package StacksAndQueues;

/**
 * @author vishwanath
 *
 */
public class StacksLLImpl {

	Node top;

	class Node {
		int data;
		Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	void push(int data) {
		if (top == null) {
			top = new Node(data);
			return;
		}
		Node n = new Node(data);
		n.next = top;
		top = n;
	}

	int pop() {
		if (top == null) {
			System.out.println("The stack is empty");
			return -1;
		}
		Node temp = top;
		top = top.next;
		temp.next = null;
		return temp.data;
	}

	boolean isEmpty() {
		return (top == null);
	}

	int peek() {
		if (top == null) {
			System.out.println("The stack is empty");
			return -1;
		}
		return top.data;
	}

	void printStack() {
		while (top.next != null) {
			System.out.println(top.data + " ");
			top = top.next;
		}
	}

	public static void main(String[] args) {
		
		StacksLLImpl stack = new StacksLLImpl();

		stack.push(5);
		stack.push(10);
		stack.push(12);
		stack.push(14);
		stack.push(27);

		stack.printStack();

		stack.pop();
		System.out.println(" " + stack.pop());

		stack.peek();
		System.out.println(" " + stack.peek());

		stack.printStack();

		System.out.println(stack.isEmpty());

	}

}
