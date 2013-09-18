package edu.datastructures;

import java.io.*;

interface stack {
	void push(int item);

	int pop();
}

class Stackimpl {
	private int stck[];
	private int top;

	Stackimpl(int size) {
		stck = new int[size];
		top = -1;
	}

	void push(int item) {
		if (top == stck.length - 1) {
			System.out.println("Stack is full! Insertion not possible");
		} else {
			stck[++top] = item;
		}
	}

	int pop() {
		if (top == -1) {
			System.out.println("stack is empty! Popping not possible!");
			return 0;
		} else {
			return stck[top--];
		}

	}
}

public class StackDemo {
	public static void main(String args[]) throws IOException {
		int a[];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the stack");
		int n = Integer.parseInt(br.readLine());
		Stackimpl obj1 = new Stackimpl(n);
		a = new int[n];
		System.out.println("enter number into stack");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("numbers are inserted");
		for (int i = 0; i < n; i++)
			obj1.push(a[i]);
		System.out.println("The following numbers are popped out");
		for (int i = 0; i < n; i++)
			System.out.println("" + obj1.pop());
	}
}
