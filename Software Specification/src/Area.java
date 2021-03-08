/*********************************************************************
 * Name 	:- Area
 * Date 	:- 26-02-2021
 * Author 	:- Naveen Verma
 * Purpose 	:- To find area of tringle, rectangle, square, circle
 *********************************************************************/

import java.util.*;
public class Area{
	/*****************************************************************************
	 * Name	:- triangle
	 * Date :- 26-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO find area of triangle
	 * Input :- Take two double values
	 * @param h
	 * @param w
	 * Output :- gives area of triangle
	 * @return double area
	 *****************************************************************************/
	public static double triangle(double h,double w) throws ArithmeticException{
		double area=(h*w)/2;
		return area;
	}
	
	/*****************************************************************************
	 * Name	:- rectangle
	 * Date :- 26-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO find area of rectangle
	 * Input :- Take two double values
	 * @param h
	 * @param w
	 * Output :- gives area of rectangle
	 * @return double area
	 *****************************************************************************/
	public static double rectangle(double h,double w) throws ArithmeticException{
		double area=(h*w);
		return area;
	}
	
	/*****************************************************************************
	 * Name	:- square
	 * Date :- 26-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO find area of square
	 * Input :- Take a double values
	 * @param w
	 * Output :- gives area of square
	 * @return double area
	 *****************************************************************************/
	public static double square(double w) throws ArithmeticException{
		double area=(w*w);
		return area;
	}
	
	/*****************************************************************************
	 * Name	:- circle
	 * Date :- 26-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO find area of circle
	 * Input :- Take a double values
	 * @param r
	 * Output :- gives area of circle
	 * @return double area
	 *****************************************************************************/
	public static double circle(double r) throws ArithmeticException{
		double area=3.14*(r*r);
		return area;
	}

	/*****************************************************************************
	 * Name	:- main 
	 * Date :- 26-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO run all the functions
	 *****************************************************************************/
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Press 1 to find area of a triangle");
		System.out.println("Press 2 to find area of a rectangle");
		System.out.println("Press 3 to find area of a square");
		System.out.println("Press 4 to find area of a circle");

		int ch=sc.nextInt();
		switch(ch){
			case 1:
				System.out.println("Enter width and heigth of triangle");
				double h=sc.nextDouble();
				if(h<0){
					System.out.println("Hight should gratter then Zero");
					h=sc.nextDouble();
				}
				double w=sc.nextDouble();
				if(w<0){
					System.out.println("writh should gratter then Zero");
					h=sc.nextDouble();
				}
				System.out.printf("%.2f",triangle(h,w));
				break;
			case 2:
				System.out.println("Enter width and heigth of rectangle");
				double l=sc.nextDouble();
				if(l<0){
					System.out.println("value should gratter then Zero");
					l=sc.nextDouble();
				}
				double b=sc.nextDouble();
				if(b<0){
					System.out.println("value should gratter then Zero");
					b=sc.nextDouble();
				}
				System.out.printf("%.2f",rectangle(l,b));
				break;
			case 3 :
				System.out.println("Enter width of square");
				double a=sc.nextDouble();
				if(a<0){
					System.out.println("value should gratter then Zero");
					a=sc.nextDouble();
				}
				System.out.printf("%.2f",square(a));
				break;
			case 4:
				System.out.println("Enter radius of circle");
				double r=sc.nextDouble();
				if(r<0){
					System.out.println("value should gratter then Zero");
					r=sc.nextDouble();
				}
				System.out.printf("%.2f",circle(r));
				break;
			default:
				System.out.println("Invalid choice");

		}
	}
}
