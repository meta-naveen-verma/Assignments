import static org.junit.Assert.*;

import org.junit.Test;


public class MatrixTest {
	int m=2,n=2,arr1[][]={{1,2},{2,1}},arr2[][]={{3,5},{4,3}};
	Matrix obj1 = new Matrix(arr1,m,n);
	Matrix obj2 = new Matrix(arr2,m,n);
	@Test
	public void testTranspose() {
		int result[][]={{3,4},{5,3}};
		int[][] trans = obj2.transpose();
		assertArrayEquals(result,trans);
 	}
	public void testSymmetrical() {
		boolean check = obj1.symmetrical();
		assertEquals(true,check);
 	}
	public void testadd() {
		int result[][]={{4,7},{6,4}};
		int[][] sum = obj1.add(obj2.arr);
		assertArrayEquals(result,sum);
 	}
	public void testmul() {
		int result[][]={{11,11},{10,13}};
		int[][] mul = obj1.mul(obj2.arr);
		assertArrayEquals(result,mul);
 	}
}
