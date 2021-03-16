import java.util.ArrayList;
import java.util.Scanner;
class CircularQueue<T> implements Queue<T>{ 
	private int size, front, rear; 
	private ArrayList<T> queue = new ArrayList<T>(); 
	CircularQueue(int size) 
	{ 
	    this.size = size; 
	    this.front = this.rear = -1; 
	}  
	public boolean isQueueEmpty(){
		if(front == -1) 
	    { 
	        return true;  
	    } 
		return false;
	}
	public boolean isQueueFull(){
		if((front == 0 && rear == size - 1) || 
			      (rear == (front - 1) % (size - 1))) 
		{ 
			        return true; 
		}
		return false;
	}
	public void enQueue (T data) throws AssertionError
	{ 
	    if(isQueueFull()) 
	    { 
	    	throw new AssertionError("Queue is Full");
	    }  
	    else if(front == -1) 
	    { 
	        front = 0; 
	        rear = 0; 
	        queue.add(rear, data); 
	    } 
	    else if(rear == size - 1 && front != 0) 
	    { 
	        rear = 0; 
	        queue.set(rear, data); 
	    } 
	  
	    else
	    { 
	        rear = (rear + 1); 
	      
	        // Adding a new element if  
	        if(front <= rear) 
	        { 
	            queue.add(rear, data); 
	        } 
	      
	        // Else updating old value 
	        else
	        { 
	            queue.set(rear, data); 
	        } 
	    } 
	} 
	public T deQueue()throws AssertionError 
	{ 
	    T temp; 
	    if(isQueueEmpty())  
	    { 
	    	throw new AssertionError("Queue is Full"); 
	    } 
	  
	    temp = queue.get(front); 
	    if(front == rear) 
	    { 
	        front = -1; 
	        rear = -1; 
	    } 
	  
	    else if(front == size - 1) 
	    { 
	        front = 0; 
	    } 
	    else
	    { 
	        front = front + 1; 
	    } 
	    return temp; 
	} 
	public void displayQueue() 
	{  
	    if(front == -1) 
	    { 
	        System.out.print("Queue is Empty"); 
	        return; 
	    } 
	    System.out.print("Elements in the " + 
	                     "circular queue are: "); 
	  
	    if(rear >= front) 
	    { 
	        for(int i = front; i <= rear; i++) 
	        { 
	            System.out.print(queue.get(i)); 
	            System.out.print(" "); 
	        } 
	        System.out.println(); 
	    }
	    else
	    { 
	        for(int i = front; i < size; i++) 
	        { 
	            System.out.print(queue.get(i)); 
	            System.out.print(" "); 
	        } 
	        for(int i = 0; i <= rear; i++) 
	        { 
	            System.out.print(queue.get(i)); 
	            System.out.print(" "); 
	        } 
	        System.out.println(); 
	    } 
	} 
	public static void main(String[] args) 
	{ 
	    CircularQueue<Integer> q = new CircularQueue(5); 
	    Scanner sc=new Scanner(System.in);
	    while(true){
	    	System.out.println("\n1.Enqueue\n2.DeQueue\n3.Display\n4.IsQueueFull\n5.IsQueueEmpty\n6.Exit");
	    	int x=sc.nextInt();
	    	if(x==1){
	    		System.out.print("Element--->");
	    		int n=sc.nextInt();
	    		q.enQueue(n);
	    	}else if(x==2){
	    		  int n = q.deQueue();
	    		  System.out.print("Deleted value = "); 
	    		  System.out.println(n); 
	    	}else if(x==3){
	    		q.displayQueue();
	    	}else if(x==4){
	    		System.out.println(q.isQueueFull());
	    	}else if(x==5){
	    		System.out.println(q.isQueueEmpty());
	    	}else if(x==6){
	    		break;
	    	}else{
	    		System.out.println("Select a right option");
	    	}
	    }
	} 
	} 