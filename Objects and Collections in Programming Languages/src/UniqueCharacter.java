import java.util.*;
public class UniqueCharacter {
    public static HashMap<String,Integer> cache=new HashMap<>();
    
    public static int countUniqueCharacter(String input){
    	Set<Character> set=new HashSet<Character>();
    	for(char c:input.toCharArray()){
    		set.add(c);
    	}
    	return set.size();
    }
    public static void getString(){
    	System.out.println("Enter the string");
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	if(cache.isEmpty()){
    		int c=countUniqueCharacter(str);
    		cache.put(str,c);
    		System.out.println("The number of unique characters are "+c);
    	}
    	else{
    		if(cache.containsKey(str))
    			System.out.println("Result from catch\nThe number of unique characters are "+cache.get(str));
    		else{
    			int c=countUniqueCharacter(str);
        		cache.put(str,c);
        		System.out.println("The number of unique characters are "+c);
    		}
    	}
    }
    
    public static void main(String arg[]){
    	Scanner sc=new Scanner(System.in);
    	int a=1;
    	while(a!=0){
    		System.out.println("1.CountUniqueCharacter\n2.Exit");
        	int n=sc.nextInt();
    	   switch(n){
    	   case 1 : getString();
    	            break;
    	   case 2 : System.out.println("Thanks");
    		        a=0;
    		        break;
    	   default : System.out.println("You entered wrong choice.Please choose again");
    	   }
       }
    }
}
