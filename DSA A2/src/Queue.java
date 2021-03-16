
public interface Queue <T>{
	public void enQueue(T data);
	public T deQueue();
	public void displayQueue();
	public boolean isQueueEmpty();
	public boolean isQueueFull();
}
