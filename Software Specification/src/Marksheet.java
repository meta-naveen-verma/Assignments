/*********************************************************************
 * Name 	:- Marksheet
 * Date 	:- 25-02-2021
 * Author 	:- Naveen Verma
 * Purpose 	:- To find average, maximum, minimum, percent
 *********************************************************************/

import java.util.*;
public class Marksheet{
	/*****************************************************************************
	 * Name	:- average
	 * Date :- 25-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO calculate average of given array
	 * Input :- take array
	 * @param arr
	 * Output :- average of array
	 * @return int avg
	 *****************************************************************************/
	public static float average(int []arr) throws ArithmeticException{
		float sum=0;
		float avg=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		avg=sum/arr.length;
		return avg;
	}
	/*****************************************************************************
	 * Name	:- maximum
	 * Date :- 25-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO calculate maximum of given array
	 * Input :- take array
	 * @param arr
	 * Output :- maximum of array
	 * @return int max
	 *****************************************************************************/
	public static float maximum(int []arr) throws ArithmeticException{
		float max=0;
		for(int i=0;i<arr.length;i++){
		if(max<arr[i])
			max=arr[i];
		}
		return max;
	}
	/*****************************************************************************
	 * Name	:- minimum
	 * Date :- 25-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO calculate minimum of given array
	 * Input :- take array
	 * @param arr
	 * Output :- minimum of array
	 * @return int min
	 *****************************************************************************/
	public static float minimum(int []arr) throws ArithmeticException{
		float min=100;

		for(int i=0;i<arr.length;i++){
			if(min>arr[i])
				min=arr[i];
		}
		return min;
	}
	/*****************************************************************************
	 * Name	:- percent
	 * Date :- 25-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO calculate percent of given array
	 * Input :- take array
	 * @param arr
	 * Output :- percent of array
	 * @return int per
	 *****************************************************************************/
	public static float percent(int []a) throws ArithmeticException{
		float per=0;
		int count=0;

		for(int i=0;i<a.length;i++){
			if(a[i]>=40)
				count++;
		}
		per=(count*100)/a.length;
		return per;
	}

	/*****************************************************************************
	 * Name	:- main 
	 * Date :- 25-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO run all the functions
	 *****************************************************************************/
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of students");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter marks of students");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			if(a[i]<0 || a[i]>100){
				System.out.println("Grades will be between 0 and 100 both inclusive\nPlease enter grade again");
				i--;
			}
		}

		System.out.println("Press 1 to find average");
		System.out.println("Press 2 to find maximum grade");
		System.out.println("Press 3 to find minimum grade");
		System.out.println("Press 4 to find percentage of students passed");

		int ch=sc.nextInt();
		switch(ch){
		case 1:

			System.out.printf("%.2f",average(a));
			break;
		case 2:

			System.out.printf("%.2f",maximum(a));
			break;
		case 3 :

			System.out.printf("%.2f",minimum(a));
			break;
		case 4:

			System.out.printf("%.2f",percent(a));
			break;
		default:
			System.out.println("Invalid choice");

		}
	}

}
