import static org.junit.Assert.*;

import org.junit.Test;


public class SearchTest {

	@Test
	public void linearsearchTest() {
		Search search=new Search();
		int arr[] ={1,2,3,4,5,6,7,8,9,12,23,34,45,56,67,78,89,90};
		int find[]={34,45,89,1,56,54,87,121,23,45,12,67,21,65,33,14,6,2,5,1,0};
		int ans[]={11,12,16,0,13,-1,-1,-1,10,12,9,14,-1,-1,-1,-1,5,1,4,0,-1};
		for(int i=0;i<find.length;i++){
			assertEquals(ans[i],search.linearsearch(arr, find[i]));
		}
	}
	@Test
	public void binarysearchTest() {
		Search search=new Search();
		int arr[] ={1,2,3,4,5,6,7,8,9,12,23,34,45,56,67,78,89,90};
		int find[]={34,45,89,1,56,54,87,121,23,45,12,67,21,65,33,14,6,2,5,1,0};
		int ans[]={11,12,16,0,13,-1,-1,-1,10,12,9,14,-1,-1,-1,-1,5,1,4,0,-1};
		for(int i=0;i<find.length;i++){
			assertEquals(ans[i],search.binarysearch(arr, find[i]));
		}
	}

}
