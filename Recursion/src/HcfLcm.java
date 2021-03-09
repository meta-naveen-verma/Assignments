import java.util.Scanner;
class HcfLcm{
	public static int hcf(int num1, int num2)
    {
        if (num2 != 0)
            return hcf(num2, num1 % num2);
        else
            return num1;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
        int num1 = sc.nextInt();
        int num2 =  sc.nextInt();
        int hcf = hcf(num1, num2);

        System.out.printf("G.C.D of %d and %d is %d.", num1, num2, hcf);
        System.out.println();

        int lcm=lcm(num1,num2);

        System.out.println("LCM of "+num1+" and "+num2+" is ="+lcm);
    }
	public static int lcm(int n1,int n2)
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
