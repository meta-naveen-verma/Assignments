/*********************************************************************
 * Name 	:- ArrOperationTest
 * Date 	:- 26-02-2021
 * Author 	:- Naveen Verma
 * Purpose 	:- To test ArrayOperation class 
 *********************************************************************/
import static org.junit.Assert.*;

import org.junit.Test;


public class ArrOperationTest {

	@Test
	public void mirrorTesting() {
		int arr1[]={1,2,3,8,9,3,2,1},ans1=3;
		int arr2[]={7,1,4,9,7,4,1},ans2=2;
		int arr3[]={1,2,1,4},ans3=3;
		int arr4[]={1,4,5,3,5,4,1},ans4=7;
		ArrOperation obj=new ArrOperation();
		
		assertEquals(ans1,obj.largestMirrorSize(arr1));
		assertEquals(ans2,obj.largestMirrorSize(arr2));
		assertEquals(ans3,obj.largestMirrorSize(arr3));
		assertEquals(ans4,obj.largestMirrorSize(arr4));
		
	}
	@Test
	public void clumpsTesting() {
		int arr1[]={1,2,2,3,4,4},ans1=2;
		int arr2[]={1, 1, 2, 1, 1},ans2=2;
		int arr3[]={1,1,1,1,1},ans3=1;
		ArrOperation obj=new ArrOperation();
		assertEquals(ans1,obj.numberOfClumps(arr1));
		assertEquals(ans2,obj.numberOfClumps(arr2));
		assertEquals(ans3,obj.numberOfClumps(arr3));
		
	}
	@Test
	public void fixXYTesting() {
		int x=4,y=5;
		int arr1[]={5, 4, 9, 4, 9, 5},ans1[]={9, 4, 5, 4, 5, 9};
		int arr2[]={1, 4, 1, 5},ans2[]={1, 4, 5, 1};
		int arr3[]={1, 4, 1, 5, 5, 4, 1},ans3[]={1, 4, 5, 1, 1, 4, 5};
		ArrOperation obj=new ArrOperation();
		assertArrayEquals(ans1,obj.fixXY(arr1,x,y));
		assertArrayEquals(ans2,obj.fixXY(arr2,x,y));
		assertArrayEquals(ans3,obj.fixXY(arr3,x,y));
		
	}
	@Test
	public void splitArrayTesting() {
		int arr1[]={1, 1, 1, 2, 1},ans1=3;
		int arr2[]={2, 1, 1, 2, 1},ans2=-1;
		int arr3[]={10, 10},ans3=1;
		ArrOperation obj=new ArrOperation();
		System.out.println(obj.splitArray(arr1));
		System.out.println(obj.splitArray(arr2));
		System.out.println(obj.splitArray(arr3));
		
		assertEquals(ans1,obj.splitArray(arr1));
		assertEquals(ans2,obj.splitArray(arr2));
		assertEquals(ans3,obj.splitArray(arr3));
		
	}
}
