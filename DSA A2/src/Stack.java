import java.util.ArrayList;
import java.util.List;

public interface Stack<T> {
	public void push(T x);
	public T pop();
	public T peek();
	public boolean empty();
}
