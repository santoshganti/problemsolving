package edu.datastructures;

public class LinkImpl implements Link {
	private Link next;
	private Link previous;
	private Object key;

	public LinkImpl(Link previous, Object key, Link next) {
		this.previous = previous;
		this.key = key;
		this.next = next;
	}

	@Override
	public Object getKey() {
		return key;
	}

	@Override
	public Link getPrevious() {
		return previous;
	}

	@Override
	public Link getNext() {
		return next;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public void setPrevious(Link previous) {
		this.previous = previous;
	}

	public void setNext(Link next) {
		this.next = next;
	}
}
