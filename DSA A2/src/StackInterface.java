public interface StackInterface {
	public class Node {
		int data; 
		Node link; 
	}
	public void push(int x);
	public boolean isEmpty();
	public int peek();
	public int pop();
}
