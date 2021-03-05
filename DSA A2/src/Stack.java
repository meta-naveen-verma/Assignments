import static java.lang.System.exit;
class Stack  implements StackInterface{
	public class Node {
		int data; 
		Node link; 
	}
	Node top;
	Stack()
	{
		this.top = null;
	}
	
	public void push(int x)
	{
		Node temp = new Node();
		if (temp == null) {
			System.out.print("\nHeap Overflow");
			return;
		}
		temp.data = x;
		temp.link = top;
		top = temp;
	}
	public boolean isEmpty()
	{
		return top == null;
	}
	public int peek()
	{
		if (!isEmpty()) {
			return top.data;
		}
		else {
			return 0;
		}
	}
	public int pop() 
	{
		if (!isEmpty()) {
			int temp=top.data;
			top = (top).link;
			return temp;
			
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
		
	}

	
}
