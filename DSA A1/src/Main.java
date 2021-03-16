import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = new ArrayList<>();
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		ls.add(7);
		
		int l=2,r=5,n=2;
		
		LinkedListOp lsOp =new LinkedListOp(ls);
		lsOp.displayLinkList();
		lsOp.rotateSubList(l, r, n);
		System.out.println("After Operation");
		lsOp.displayLinkList();
		
		
	}

}
