/*********************************************************************
 * Name 	:- StringOp
 * Date 	:- 25-02-2021
 * Author 	:- Naveen Verma
 * Purpose 	:- To perform operations(compare, reverse, caseChange, findLargestWord) on string
 *********************************************************************/

import java.util.*;
public class StringOp{
	
	/*****************************************************************************
	 * Name	:- compare
	 * Date :- 25-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO check given strings are equals or not
	 * Input :- Take two strings
	 * @param str1
	 * @param str2
	 * Output :- gives 1 if str1 and str2 are equal else 0
	 * @return int value (0 or 1).
	 *****************************************************************************/
	public static int compare(String str1,String str2){
		if(str1.length()==str2.length()){
			for(int i=0;i<str1.length();i++){
				if(str1.charAt(i)!=str2.charAt(i)){
					return 0;
				}
			}
		}
		else
			return 0;
		return 1;
	}
	
	/*****************************************************************************
	 * Name	:- reverse
	 * Date :- 25-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO reverse the given string
	 * Input :- Take a strings
	 * @param str
	 * Output :- gives reverse of given string str
	 * @return String result 
	 *****************************************************************************/
	public static String reverse(String str){
		String result="";
		for(int i=str.length()-1;i>=0;i--){
			result+=str.charAt(i);
		}
		return result;
	}
	
	/*****************************************************************************
	 * Name	:- caseChange
	 * Date :- 25-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO change the case of given string
	 * Input :- Take a strings
	 * @param str
	 * Output :- gives case changed string(upper to lower and lower to upper)
	 * @return String result 
	 *****************************************************************************/
	public static String caseChange(String str){
		String result="";
		for(int i=0;i<str.length();i++){
			if(Character.isLowerCase(str.charAt(i)))

				result+=Character.toUpperCase(str.charAt(i));
			else
				result+=Character.toLowerCase(str.charAt(i));

		}
		return result;
	}
	
	/*****************************************************************************
	 * Name	:- findLargestWord
	 * Date :- 25-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO find largest word in given string
	 * Input :- Take a strings
	 * @param str
	 * Output :- gives largest word as a string
	 * @return String large 
	 *****************************************************************************/
	public static String findLargestWord(String str){  
		String word = "", large="";    
		String[] words = new String[100];    
		int length = 0;      
		str+=" ";    
          
		for(int i = 0; i < str.length(); i++){    
            
          if(str.charAt(i) != ' '){    
              word = word + str.charAt(i);    
          }    
          else{    
                
              words[length] = word;   
              length++;    
              word = "";    
          }    
      }            
 
      large = words[0];    
      for(int k = 0; k < length; k++){      
          if(large.length() <= words[k].length())    
              large = words[k]; 
      }    
      return large;
	}
	
	/*****************************************************************************
	 * Name	:- main 
	 * Date :- 25-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- TO run all the functions
	 *****************************************************************************/
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to compare two string");
		System.out.println("Press 2 to reverse a string");
		System.out.println("Press 3 to change the case of a string");
		System.out.println("Press 4 to find largest word of a string");

		int ch=sc.nextInt();
		switch(ch){
		case 1:
			String str1=sc.next();
			String str2=sc.next();
			System.out.println(compare(str1,str2));
			break;
		case 2:
			String str=sc.next();
			System.out.println(reverse(str));
			break;
		case 3 :
			String strInCase=sc.next();
			System.out.println(caseChange(strInCase));
			break;
		case 4:
			sc.nextLine();
			String line=sc.nextLine();
			System.out.println(findLargestWord(line));
			break;
		default:
			System.out.println("Invalid choice");

		}
	}

}
