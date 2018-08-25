package pers.itlivemore.list.singlelist;

class Node {
	Integer value;
	Node next;

	public Node() {
		super();
	}

	public Node(Integer value, Node next) {
		super();
		this.value = value;
		this.next = next;
	}

	public Node(Integer value) {
		super();
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}