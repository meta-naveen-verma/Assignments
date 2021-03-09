import java.util.*;
class Search
{
    public static int linearsearch(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
  
    public static int binarysearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        //Arrays.sort(arr);
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            
            if (arr[m] == x) 
                return m; 
  
            
            if (arr[m] < x) 
                l = m + 1; 
  
            
            else
                r = m - 1; 
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
    			result = linearsearch(arr, x);
    			break;
    		}
    		else if (ch==2){
    			result = binarysearch(arr, x);
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
