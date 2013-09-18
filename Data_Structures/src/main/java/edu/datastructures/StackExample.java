package edu.datastructures;

public class StackExample {
	private int maxSize;
	private long[] stackArray;
	private int top;

	public StackExample(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}

	public void push(long j) {
		stackArray[++top] = j;
	}

	public long pop() {
		return stackArray[top--];
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public static void main(String[] args) {
		StackExample stack1 = new StackExample(10);
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		stack1.push(50);
		while (!stack1.isEmpty()) {
			long value = stack1.pop();
			System.out.print(value);
			System.out.print("");
		}
		System.out.println("");
	}
}
