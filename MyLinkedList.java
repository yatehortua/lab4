// Ysabella Atehortua and Loren Behumi Davis //

import java.util.AbstractList;

public class MyLinkedList<T> extends AbstractList<T> {
    private Node head;
    private Node tail;
    int size = 0;

    protected class Node {
	T data;
	Node next;
	Node prev;

	Node() {

	}

	private Object getNth(int index) {
	    Node p = new Node();
	    p = head;
	    int count = 0;
	    while (p != null) {
		if (count == index) {
		    return p;
		}
		count++;
		p = p.next;
	    }
	    return p;
	}

    }

    public boolean add(T data) {
	if (head == null) {
	    Node newNode = new Node();
	    newNode.data = data;
	    head = newNode;
	    size++;
	} else {
	    Node temp = head;
	    while (temp.next != null) {
		temp = temp.next;
	    }
	    Node node = new Node();
	    temp.next = node;
	    node.data = data;
	    node.prev = temp;
	    size++;
	}
	return true;
    }

    public void add(int index, T data) {
	if (index < 0 || index > size) {
	    throw new IllegalArgumentException("index was out of bounds");
	} else if (index == 0) {
	    Node temp = new Node();
	    temp.data = data;
	    temp.next = head;
	    head = temp;
	} else if (index == size) {
	    add(data);
	} else {
	    Node p = head;
	    for (int i = 0; i < index - 1; i++) {
		p = p.next;
	    }
	    Node left = p;
	    Node right = p.next;
	    Node newNode = new Node();
	    newNode.data = data;
	    newNode.next = right;
	    newNode.prev = left;
	    left.next = newNode;
	    right.prev = newNode;
	}
	size++;
    }

    public T get(int index) {
	if (index < 0 || index > size) {
	    throw new IllegalArgumentException("index was out of bounds");
	}
	Node newNode = new Node();
	newNode = head;
	for (int i = 0; i < index; i++) {
	    newNode = newNode.next;
	}
	return newNode.data;
    }

    public T set(int i, T data) {
	Node start = new Node();
	start = head;
	int count = 0;
	while (count < i) {
	    start = start.next;
	    count++;
	}
	T datasave = start.data;
	start.data = data;
	return datasave;
    }

    public T remove(int i) {
	Node start = new Node();
	start = head;
	int count = 0;
	while (count < i - 1) {
	    start = start.next;
	    count++;
	}
	for (int j = i; j < size; j++) {

	}
    }

    public void clear() {
	current = head;
	while (current != null) {
	    current = null;
	    current = current.next;
	}
	size = 0;
	tail.data = null;
	head.data = null;
	head.next = tail;
    }

    public boolean isEmpty() {
	return size == 0;

    }

    public int size() {
	return size;

    }
}
