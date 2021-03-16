import java.util.ArrayList;
import java.util.List;


public class StackOperations<T> implements Stack<T>{
	List<T> ls=new ArrayList<T>();
	public void push(T x){
		ls.add(x);
	}
	public T pop() throws AssertionError{
		if(ls.size()>0){
		T x=ls.get(ls.size()-1);
		ls.remove(ls.size()-1);
		return x;}
		else
			throw new AssertionError("Stack is Empty");
	}
	public T peek(){
		return ls.get(ls.size()-1);
	}
	public boolean empty(){
		if(ls.size()==0)
			return true;
		return false;
	}
}
