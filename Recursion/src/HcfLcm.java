import java.util.Scanner;
class HcfLcm{
 public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two numbers");
        int n1 = sc.nextInt();
        int n2 =  sc.nextInt();
        int hcf = hcf(n1, n2);

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
	System.out.println();

	int lcm=lcmCalculation(n1,n2);

        System.out.println("LCM of "+n1+" and "+n2+" is ="+lcm);
    }
 public static int lcmCalculation(int n1,int n2)
	{
	  int temp,i=2,res;
	  if(n1>n2)
		res=n1;
	  else
		res=n2;
	   temp=res;
	   while(res%n1!=0 || res%n2!=0)
		{
		res=temp*i;
		i++;
		}
	  return res;
 
 	 }

}