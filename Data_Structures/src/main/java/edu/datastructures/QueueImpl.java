package edu.datastructures;

/*
 * Array Implementation of queue ! Actually circular array implementation of queue! 
 * front and rear variables point to the obvious.
 * 
 * @author: Santosh Ganti
 */
public class QueueImpl implements Queue {
	private Object queue[];
	private int front, rear;

	/*
	 * Constructor to creat and initialize objects also define intial front and
	 * rear variables
	 */

	public QueueImpl(int size) {
		queue = new Object[size];
		rear = front = -1;
	}

	/*
	 * Method to add items onto the queue
	 */
	public void enqueue(Object item) {
		if (isFull())
			System.out.println("*******Queue OVerflow******");
		else {
			rear++;
			queue[rear] = item;
			if (front == -1)
				front = 0;
			System.out.println("*****Element Added******");
		}
	}

	/*
	 * Method to remove elements from queue.
	 */
	public Object dequeue() {
		Object x;
		if (isEmpty()) // check whether queue contains any element to be deleted
						// or not
			x = -999; 
		else {
			x = queue[front];
			queue[front] = 0;
			if (front == rear) // if last element is removed queue again becomes
								// empty
				front = rear = -1;
			else
				front++; // because element is removed from queue from front end
		}
		return x;
	}

	/*
	 * Method to check if queue is empty
	 */
	public boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;

	}

	/*
	 * Method to check if queue is full.
	 */
	public boolean isFull() {
		if (front == -1)// to check for empty queue
			return true;
		else
			return false;
	}

	/*
	 * Method to show elements of queue. if queue is not empty, then a loop is
	 * run from’ front’ to ‘rear’ to show all the elements of queue from
	 * beginning till end.
	 */
	public void show() {
		if (isEmpty()) // if empty there is nothing to display in queue
			System.out.print("****Empty*****");
		else {
			for (int i = front; i <= rear; i++)
				System.out.print(queue[i] + "  ");
		}
		System.out.println();
	}
}
