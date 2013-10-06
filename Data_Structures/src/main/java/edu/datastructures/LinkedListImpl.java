package edu.datastructures;

/**
 * Implementing doubly linked list
 * 
 * @author santoshganti
 * 
 */
public class LinkedListImpl implements LinkedList {
	private LinkImpl currenthead;
	private LinkImpl tail;
	private LinkImpl linkedList[];
	private int currentIndex;

	public LinkedListImpl(int maxCapacity) {
		linkedList = new LinkImpl[maxCapacity];
	}

	@Override
	public void insert(Object key) {
		if (currenthead == null) {
			// If head is null , we have to make it not null i.e point to the
			// link we are inserting
			LinkImpl link = new LinkImpl(null, key, null);
			currenthead = link;
			tail = link;
			linkedList[currentIndex++] = link;
		} else {
			// if head is already present then next(currenthead)=currentlink

			LinkImpl currentlink = new LinkImpl(null, key, currenthead);
			// since current link's previous pointer was null , and now a new
			// head is inserted its previous must point to current head.
			currenthead.setPrevious(currentlink);
			// Now we have to store the link in linkedlist array and we increase
			// the index(i.e from 0 to 1) and store the link in the array. This
			// also serves as size for us
			linkedList[currentIndex++] = currentlink;
			// Currentlink becomes the current head here
			currenthead = currentlink;
		}
	}

	@Override
	public Link delete(Object key) {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public int size() {

		return currentIndex;
	}

	@Override
	public Link search(Object key) {
		//Checking if list is empty
		if (currenthead == null) {
			throw new LinkedListEmptyException();
		} else {
			//if list is not empty
			//
			
			linkedList[currentIndex] = currenthead;
			while (linkedList[currentIndex] != null
					&& linkedList[currentIndex] != key) {
				currentIndex++;
			}
		}
		return linkedList[currentIndex];

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Link getHead() {
		// TODO Auto-generated method stub
		return currenthead;
	}

	@Override
	public Link getTail() {
		// TODO Auto-generated method stub
		return tail;
	}

}
