import java.util.*;
class Search
{
    public static int linearsearch(int arr[], int l, int r, int x)
    {
             if (r < l) 
                return -1; 
             if (arr[l] == x) 
                return l; 
             if (arr[r] == x) 
                return r; 
             return linearsearch(arr, l+1, r-1, x); 
    }
  
    public static int binarySearch(int arr[], int l, int r, int x) 
    {  
    	   if (r >= l) 
    	   { 
    	        int mid = l + (r - l)/2; 
    	        if (arr[mid] == x)  
    	        	return mid; 
    	        if (arr[mid] > x) 
    	        	return binarySearch(arr, l, mid-1, x); 
    	        return binarySearch(arr, mid+1, r, x); 
    	   } 
    	   return -1; 
    } 
 
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to find");
		int x = sc.nextInt();    
		int result=-1;
    	System.out.println("Press 1 for Linear search");
    	System.out.println("Press 2 for Binary search");
    	int ch=sc.nextInt();
    	while(true){
    		if(ch==1){
    			result = linearsearch(arr, 0, n-1, x);
    			break;
    		}
    		else if (ch==2){
    			result = binarySearch(arr, 0, n-1, x);
    			break;
    		}
    		else
    			System.out.println("Make a right choise");
    	}
    	if (result == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present at index "+ (result+1));

    }
}
