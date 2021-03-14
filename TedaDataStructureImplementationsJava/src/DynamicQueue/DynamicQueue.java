package DynamicQueue;

import java.util.ArrayList;

public class DynamicQueue {
	ArrayList<Integer> list;
	int head = 0;

	public DynamicQueue() {
		list = new ArrayList<Integer>();
	}

	public void enqueue(int value) {
		list.add(value);
	}

	public int dequeue() {
		if (!isEmpty()) {
			int popValue = list.get(head);
			list.remove(head);
			return popValue;
		} else {
			System.out.println("The stack is already empty");
			return -1;
		}

	}

	public boolean isEmpty() {
		if (list.isEmpty()) return true;
		else
			return false;

	}

	public int peek() {
		return list.get(head);
	}

	public void print() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {
		DynamicQueue queue = new DynamicQueue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);

		queue.print();
		System.out.println("After Dequeue instruction");
		queue.dequeue();
		queue.print();

	}

}
