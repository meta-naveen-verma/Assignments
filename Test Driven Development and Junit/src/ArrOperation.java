import java.util.ArrayList;
import java.util.List;


public class ArrOperation {
	public int largestMirrorSize(int[] arr) throws AssertionError {
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
	
	public int numberOfClumps(int[] arr) throws AssertionError {
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
	
	public int[] fixXY(int arr[], int x, int y) throws AssertionError{
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
	public List<Integer> foundY(int arr[],int y,int x){
		List<Integer> yIndexes = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==y && (i==0 || arr[i-1]!=x)){
				yIndexes.add(i);
			}
		}
		return yIndexes;
	}
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
	
}
