import java.util.Scanner;
class HcfLcm{ 
	static int t;
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
	public static int lcm(int num1,int num2)
	{
				lcm(num1,num2,1);
		        return t;
 	 }
	public static int lcm(int num1,int num2,int temp)
	{ 
		    t=temp; 
		    if(temp%num1 == 0 && temp%num2 == 0)
		    {
		        return temp;
		    }
		    else
		    {
		        temp++;
		        lcm(num1,num2,temp);
		        return temp;
		    }
 
 	 }

}
