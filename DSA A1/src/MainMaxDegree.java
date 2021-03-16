import java.util.Scanner;


public class MainMaxDegree {
	public static void main(String[] args) {
		System.out.println("Enter an equation---> ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		MaxDegree md=new MaxDegree(str);
		System.out.println("Max Degree is "+md.calculateMaxDegree());
	}
}
