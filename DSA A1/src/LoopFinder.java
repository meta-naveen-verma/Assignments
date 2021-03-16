
public class LoopFinder {
	static Node head;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    boolean detectLoop(Node node)
    {
        Node incBy1 = node, incBy2 = node;
        while (incBy1 != null && incBy2 != null
               && incBy2.next != null) {
        	incBy1 = incBy1.next;
        	incBy2 = incBy2.next.next;
            if (incBy1 == incBy2) {
                return true;
            }
        }
        return false;
    }
    void displayLikedList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args)
    {
        LoopFinder list = new LoopFinder();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        //list.displayLikedList(head);
        System.out.println();
        if(list.detectLoop(head)){
        	System.out.println("Linked List have loop");
        }
        else{
        	System.out.println("Linked List don't have any loop : ");
        }
        
        
    }
}
