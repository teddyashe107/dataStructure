package dynamicStack;

import java.util.ArrayList;
public class DynamicStack {
	ArrayList <Integer> list;

	public DynamicStack() {
		list = new ArrayList<Integer>();
	}

	public void push(int value) {
		list.add(value);
	}

	public int pop() {
		if(!isEmpty()) {
			int popValue = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			return popValue;
		}
		else {
			System.out.println("The stack is already empty");
			return -1;
		}

}
	public boolean isEmpty() {
		if(list.isEmpty())  return true;
		else  return false;
}

	public int peek() {
		return list.get(list.size() - 1);
	}

	public void print() {
		for (int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {
		DynamicStack stack = new DynamicStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);

		System.out.println("After Pop instruction");
		stack.pop();
		stack.print();

	}


}
