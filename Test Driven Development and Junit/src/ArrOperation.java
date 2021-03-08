/*********************************************************************
 * Name 	:- StringOp
 * Date 	:- 26-02-2021
 * Author 	:- Naveen Verma
 * Purpose 	:- To perform operations(largest mirror size, slpit array in two parts, set xy pattern in array) on array
 *********************************************************************/
import java.util.ArrayList;
import java.util.List;
public class ArrOperation {
	
	/*****************************************************************************
	 * Name	:- largestMirrorSize
	 * Date :- 26-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO find largest mirror size in array
	 * Input :- Take an array
	 * @param arr
	 * Output :- gives size of largest mirror in array
	 * @return int max.
	 *****************************************************************************/
	public static int largestMirrorSize(int[] arr) throws AssertionError {
		if(arr==null){
			throw new AssertionError("Null Array Provided ");
		}
		if(arr.length==0){
			throw new AssertionError("Length of Array is 0 ");
		}
		int max=1;
		int longestSeq[][]=new int[arr.length+1][arr.length+1];
		for(int i=0;i<arr.length;i++){
			for(int j=arr.length-1;j>=0;j--){
				if(arr[i]==arr[j]){
					longestSeq[i+1][j]=longestSeq[i][j+1]+1;
					if(longestSeq[i+1][j]>max){
						max=longestSeq[i+1][j];
					}
				}
			}
		}
		return max;	
	}
	
	/*****************************************************************************
	 * Name	:- numberOfClumps
	 * Date :- 26-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO find number of clumps
	 * Input :- Take an array
	 * @param arr
	 * Output :- gives size of largest mirror in array
	 * @return int clumps.
	 *****************************************************************************/
	public static int numberOfClumps(int[] arr) throws AssertionError {
		if(arr==null){
			throw new AssertionError("Null Array Provided ");
		}
		if(arr.length==0){
			throw new AssertionError("Length of Array is 0 ");
		}
		int count=0,clumps=0,i=0;
		while(i<arr.length){
			while(i+1<arr.length && arr[i+1]==arr[i]){
				i++;
				count++;
			}
			if(count>=1){
				clumps++;
			}
			i++;
			count=0;
		}
		return clumps;
		
	}
	/*****************************************************************************
	 * Name	:- fixXY
	 * Date :- 26-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO set y just after x in array 
	 * Input :- Take an array, x, y
	 * @param arr
	 * @param x
	 * @param y
	 * Output :- gives array that have xy formate in array
	 * @return int[] arr.
	 *****************************************************************************/
	public static int[] fixXY(int arr[], int x, int y) throws AssertionError{
		if(arr==null){
			throw new AssertionError("Null Array Provided ");
		}
		if(arr.length==0){
			throw new AssertionError("Length of Array is 0 ");
		}
		if(arr[arr.length-1]==x){
			throw new AssertionError("x at the last index");
		}
		List<Integer> yIndexes = foundY(arr,y,x);
		int yCount=yIndexes.size();
		int pos=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x && arr[i+1]==x){
				throw new AssertionError("two x together");
			}
			if(arr[i]==x && arr[i+1]!=y){
				if (pos>=yCount){
					throw new AssertionError("insuffecient no. of y");
				}
				arr[yIndexes.get(pos)]=arr[i+1];
				arr[i+1]=y;
				pos++;
			}
		}
		return arr;
	}
	/*****************************************************************************
	 * Name	:- foundY
	 * Date :- 26-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO find index of y
	 * Input :- Take an array, x, y
	 * @param arr
	 * @param x
	 * @param y
	 * Output :- gives list of y indexes
	 * @return List<Integer> yIndexes.
	 *****************************************************************************/
	public static List<Integer> foundY(int arr[],int y,int x){
		List<Integer> yIndexes = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==y && (i==0 || arr[i-1]!=x)){
				yIndexes.add(i);
			}
		}
		return yIndexes;
	}
	/*****************************************************************************
	 * Name	:- splitArray
	 * Date :- 26-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO find index of to split array in two parst that have same sum
	 * Input :- Take an array
	 * @param arr
	 * Output :- gives index
	 * @return integer i or if not possible result will be -1
	 *****************************************************************************/
	public int splitArray(int arr[]) throws AssertionError{
		if(arr==null){
			throw new AssertionError("Null Array Provided ");
		}
		if(arr.length==0){
			throw new AssertionError("Length of Array is 0 ");
		}
		int prefixSum[]=new int[arr.length];
		int total=arr[0];
		prefixSum[0]=total;
		for(int i=1;i<arr.length;i++){
			total+=arr[i];
			prefixSum[i]=total;
		}
		for(int i=0;i<arr.length;i++){
			
			if(prefixSum[i]==(total-prefixSum[i])){
				return i+1;
			}
		}
		return -1;
	}
	public static void displayArray(int[] arr){
		for(int a:arr)
			System.out.print(a+" ");
	}
	public static void main(String[] args){
		System.out.println("Largest Mirror Size\n\n");
		int arr1[]={1,2,3,8,9,3,2,1};
		int arr2[]={7,1,4,9,7,4,1};
		int arr3[]={1,2,1,4};
		int arr4[]={1,4,5,3,5,4,1};
		displayArray(arr1);
		System.out.println("---->"+largestMirrorSize(arr1));
		displayArray(arr2);
		System.out.println("---->"+largestMirrorSize(arr2));
		displayArray(arr3);
		System.out.println("---->"+largestMirrorSize(arr3));
		displayArray(arr4);
		System.out.println("---->"+largestMirrorSize(arr4));
		
		System.out.println("Number of Clumps\n\n");
		int arr5[]={1,2,2,3,4,4};
		int arr6[]={1, 1, 2, 1, 1};
		int arr7[]={1,1,1,1,1};
		displayArray(arr5);
		System.out.println("---->"+numberOfClumps(arr5));
		displayArray(arr6);
		System.out.println("---->"+numberOfClumps(arr6));
		displayArray(arr7);
		System.out.println("---->"+numberOfClumps(arr7));
		
		
		int x=4,y=5;
		System.out.println("set "+y+"just after"+x+"\n\n");
		int arr8[]={5, 4, 9, 4, 9, 5};
		int arr9[]={1, 4, 1, 5};
		int arr10[]={1, 4, 1, 5, 5, 4, 1};
		displayArray(arr8);
		System.out.print("---->");
		displayArray(fixXY(arr8,x,y));
		System.out.println();

		displayArray(arr9);
		System.out.print("---->");
		displayArray(fixXY(arr9,x,y));
		System.out.println();

		displayArray(arr10);
		System.out.print("---->");
		displayArray(fixXY(arr10,x,y));
	}
	
}
