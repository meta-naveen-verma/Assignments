import java.util.*;
public class Marksheet{

public static float average(int []a) throws ArithmeticException{
float sum=0;
float avg=0;
	for(int i=0;i<a.length;i++){
		sum+=a[i];
}
	avg=sum/a.length;
	return avg;
}

public static float maximum(int []a) throws ArithmeticException{
float max=0;

	for(int i=0;i<a.length;i++){
		if(max<a[i])
			max=a[i];
}
	return max;
}

public static float minimum(int []a) throws ArithmeticException{
float min=100;

	for(int i=0;i<a.length;i++){
		if(min>a[i])
			min=a[i];
}
	return min;
}

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


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of students");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter marks of students");
for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
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