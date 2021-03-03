import java.util.*;
public class Area{

public static double triangle(double h,double w) throws ArithmeticException{
	double area=(h*w)/2;
	return area;
}

public static double rectangle(double h,double w) throws ArithmeticException{
	double area=(h*w);
	return area;
}

public static double square(double w) throws ArithmeticException{
	double area=(w*w);
	return area;
}

public static double circle(double r) throws ArithmeticException{
	double area=3.14*(r*r);
	return area;
}


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
double w=sc.nextDouble();
System.out.printf("%.2f",triangle(h,w));
break;
case 2:
System.out.println("Enter width and heigth of rectangle");
double l=sc.nextDouble();
double b=sc.nextDouble();
System.out.printf("%.2f",rectangle(l,b));
break;
case 3 :
System.out.println("Enter width of square");
double a=sc.nextDouble();
System.out.printf("%.2f",square(a));
break;
case 4:
System.out.println("Enter radius of circle");
double r=sc.nextDouble();
System.out.printf("%.2f",circle(r));
break;
default:
System.out.println("Invalid choice");

}
}

}
