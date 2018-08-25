package pers.itlivemore.list.singlelist;

/**
 * 单向链表
 */
public class SingleLinkedList {

	// 添加节点
	public static void addNode(Node head, Node newNode) {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// 添加节点
	public static void addNode(Node head, Integer value) {
		Node newNode = new Node(value);
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// 打印
	public static void printList(Node head) {
		if (head == null || head.next == null) {
			return;
		}
		Node temp = head.next;
		while (temp != null) {
			System.out.print(temp.value);
			temp = temp.next;
		}
	}

	// 反转链表
	public static Node reverse(Node head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		Node reverseHead = head; // 反转后的头节点
		Node now = head.next;
		Node next = now.next;
		now.next = null; // 第一个节点反转之后是最后一个节点，所以next应该为null
		while (next != null) {
			now = next;
			next = next.next;
			now.next = reverseHead.next; // 反转
			reverseHead.next = now;
		}
		return reverseHead;
	}

	public static void main(String[] args) {
		Node head = new Node();
		for (int i = 0; i < 8; i++) {
			Node node = new Node(i);
			addNode(head, node);
		}
		printList(head);
		System.out.println();
		Node reverse = reverse(head);
		printList(reverse);
	}

}
