import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListOp {
	LinkedList<Integer> ls = new LinkedList<Integer>();
	int l,r,n;
	LinkedListOp(List<Integer> list){
		ls.addAll(list);
		
	}
	public void rotateSubList(int l, int r, int n){
		this.l=l;
		this.r=r;
		this.n=n;
		while(n>0){
			Integer temp=ls.get(r-1);
			ls.remove(r-1);
			ls.add(l-1, temp);
			n--;
		}
	}
	public void displayLinkList(){
		Iterator<Integer> itr =ls.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  System.out.println(); 
		  System.out.println(); 
	}
	
}
