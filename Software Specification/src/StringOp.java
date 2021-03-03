import java.util.*;
public class StringOp{
	public static int Compare(String a,String b){
		if(a.equals(b))
			return 1;
		else
			return 0;
	}
	public static String Reverse(String a){
		String b="";
		for(int i=a.length()-1;i>=0;i--){
			b+=a.charAt(i);
		}
		return b;
	}

	public static String Casechange(String a){
		String b="";
		for(int i=0;i<a.length();i++){
			if(Character.isLowerCase(a.charAt(i)))

				b+=Character.toUpperCase(a.charAt(i));
			else
				b+=Character.toLowerCase(a.charAt(i));

		}
		return b;
	}

	public static String largestWord(String a){  
		String word = "", large="";    
		String[] words = new String[100];    
		int length = 0;      
		a = a + " ";    
          
		for(int i = 0; i < a.length(); i++){    
            
          if(a.charAt(i) != ' '){    
              word = word + a.charAt(i);    
          }    
          else{    
                
              words[length] = word;   
              length++;    
              word = "";    
          }    
      }            
 
      large = words[0];    
   
      for(int k = 0; k < length; k++){      
          if(large.length() < words[k].length())    
              large = words[k];    
      }    
      return large;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to compare two string");
		System.out.println("Press 2 to reverse a string");
		System.out.println("Press 3 to change the case of a string");
		System.out.println("Press 4 to find largest word of a string");

		int ch=sc.nextInt();
		switch(ch){
		case 1:
			String a=sc.next();
			String b=sc.next();
			System.out.println(Compare(a,b));
			break;
		case 2:
			String c=sc.next();
			System.out.println(Reverse(c));
			break;
		case 3 :
			String d=sc.next();
			System.out.println(Casechange(d));
			break;
		case 4:
			String e=sc.next();
			System.out.println(largestWord(e));
			break;
		default:
			System.out.println("Invalid choice");

		}
	}

}
