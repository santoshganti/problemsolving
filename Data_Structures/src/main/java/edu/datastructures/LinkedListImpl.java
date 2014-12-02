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

	private int maxCapacity;
	private int size;

	public LinkedListImpl(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	@Override
	public void insert(Object key) throws LinkedListFullException {
		if (size == maxCapacity) {
			throw new LinkedListFullException();
		}
		if (currenthead == null) {
			// If head is null , we have to make it not null i.e point to the
			// link we are inserting
			LinkImpl link = new LinkImpl(null, key, null);
			currenthead = link;
			tail = link;
		} else {
			// if head is already present then next(currenthead)=currentlink

			LinkImpl currentlink = new LinkImpl(null, key, currenthead);
			// since current link's previous pointer was null , and now a new
			// head is inserted its previous must point to current head.
			currenthead.setPrevious(currentlink);
			// Currentlink becomes the current head here
			currenthead = currentlink;
		}
		size++;
	}

	public boolean delete(Object key) {
		Link linkToDelete = search(key);
		if (linkToDelete == null) {
			return false;
		} else {
			LinkImpl previousLink = (LinkImpl) linkToDelete.getPrevious();
			LinkImpl nextLink = (LinkImpl) linkToDelete.getNext();
			if (previousLink != null) {
				previousLink.setNext(nextLink);
			} else {
				currenthead = nextLink;

			}
			if (nextLink != null) {
				nextLink.setPrevious(previousLink);
			} else {
				tail = previousLink;
			}
			linkToDelete = null;
			size--;
			return true;
		}

	}

	public int size() {

		return size;
	}

	public Link search(Object key) {
		// Checking if list is empty
		if (currenthead == null) {
			throw new LinkedListEmptyException();
		} else {
			// if list is not empty search for the element
			// start from the current head
			Link currentlink = currenthead;
			// Traverse every link till you reach tail
			while (currentlink != null) {
				if (currentlink.getKey().equals(key)) {
					// found the element return the current link
					return currentlink;
				} else {
					// move to the next link
					currentlink = currentlink.getNext();
				}
			}
		}
		return null;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Link getHead() {
		return currenthead;
	}

	public Link getTail() {
		return tail;
	}

}
