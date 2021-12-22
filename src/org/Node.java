package org;

public class Node<T> {
	public Node(Node<T> privious, Node<T> next, T value) {
		super();
		this.privious = privious;
		this.next = next;
		this.value = value;
	}

	private Node<T> privious;
	private Node<T> next;
	private T value;

	public Node<T> getPrivious() {
		return privious;
	}

	public void setPrivious(Node<T> privious) {
		this.privious = privious;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node(T value) {
		super();
		this.value = value;
	}

}
