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
 
    public static void main(String args[])

    {   Scanner sc=new Scanner(System.in);
System.out.println("Press 1 for Linear search");
System.out.println("Press 2 for Binary search");
int ch=sc.nextInt();
if(ch==1){

        System.out.println("Enter size of array");
int n=sc.nextInt();
        int arr[] = new int[n];
 for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("Enter element to find");
        int x = sc.nextInt();
 
       
        int result = linearsearch(arr, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result);}
else{

        System.out.println("Enter size of array");
int n=sc.nextInt();
        int arr[] = new int[n];
 for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("Enter element to find");
        int x = sc.nextInt();
	  int result1 = binarysearch(arr, x);
        if (result1 == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result1);}

    }


}