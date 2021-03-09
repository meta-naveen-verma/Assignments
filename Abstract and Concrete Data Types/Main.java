import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of 1st Array");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Element "+(i+1)+" ---> ");
			arr1[i]=sc.nextInt();
			if(arr1[i]<1 || arr1[i]>1000){
				System.out.println("Invalid Entery, The range of element is 1 to 1000");
				System.out.println("Enter element again");
				i--;
			}
		}
		System.out.println("Enter the length of 2st Array");
		n=sc.nextInt();
		int[] arr2=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Element "+(i+1)+" ---> ");
			arr2[i]=sc.nextInt();
			if(arr2[i]<1 || arr2[i]>1000){
				System.out.println("Invalid Entery, The range of element is 1 to 1000");
				System.out.println("Enter element again");
				i--;
			}
		}
		IntSet intSet1 = new IntSet(arr1);
		IntSet intSet2 = new IntSet(arr2);
		
		System.out.println(intSet1.isMember(3));
		System.out.println(intSet1.isSubSet(intSet2));
		System.out.println(Arrays.toString(IntSet.union(intSet1,intSet2)));
		System.out.println(Arrays.toString(intSet1.getComplement()));
		
		
		
	}

}
