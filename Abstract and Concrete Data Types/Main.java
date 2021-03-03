import java.util.Arrays;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		IntSet intSet1 = new IntSet(new int[]{1,2,3,4,5,4,5,6});
		IntSet intSet2 = new IntSet(new int[]{3,4});
		
		System.out.println(intSet1.isMember(3));
		System.out.println(intSet1.isSubSet(intSet2));
		System.out.println(Arrays.toString(IntSet.union(intSet1,intSet2)));
		System.out.println(Arrays.toString(intSet1.getComplement()));
		
		
		
	}

}