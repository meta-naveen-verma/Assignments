import java.util.*;
public class Employee {
    public String empId;
    public String empName;
    public String empAddr;
    public Employee(String id,String name,String addr){
    	empId=id;
    	empName=name;
    	empAddr=addr;
    }
    public String getName(){
    	return this.empName;
    }
    public String getId(){
    	return this.empId;
    }
    public String getAddr(){
    	return this.empAddr;
    }
    
    public static HashMap<String,Employee> emp=new HashMap<>();
    public static void printList(){
		if(emp.isEmpty())
			System.out.println("No Employee is present in list");
		else{
			Iterator<Map.Entry<String,Employee>> itr =emp.entrySet().iterator();
			System.out.println("The employee map is");
			System.out.println("EmpId \t      EmpName \t    EmpAddress");
			while(itr.hasNext()){
	            Map.Entry<String, Employee> entry = itr.next();
	            System.out.println(entry.getKey()+"\t \t"+entry.getValue().empName+"\t \t"+entry.getValue().empAddr);
	        }
		}
	}
    public static void addEmployee(){
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Employee id --->");
    	String empid=sc.next();
    	if(emp.containsKey(empid)){
    		System.out.println("Enployee id is already taken");
    	}else{
    		System.out.print("Name--->");
    		String name=sc.next();
    		sc.nextLine();
    		System.out.print("Address--->");
        	String address=sc.nextLine();
        	Employee e= new Employee(empid,name,address);
    		emp.put(e.empId, e);
    	}
    }
    public static void main(String arg[]){
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		System.out.print("1.Add Employee\n"+
    						 "2.Sort Employee by natural order\n"+
    						 "3.Sort Employee by name\n"+
    						 "4.Exit\n"+
    						 "--->");
    		int ch=sc.nextInt();
    		if(ch==1){
    			addEmployee();
    		}else if(ch==2){
    			printList();
    			emp=SortNatural.sortNatural(emp);
    			printList();
    		}else if(ch==3){
    			printList();
    			emp=SortByName.sortByValue(emp);
    			printList();
    		}else if(ch==4){
    			break;
    		}else{
    			System.out.println("\nSelect a right option");
    		}
    	}
		  
    }
    
}
