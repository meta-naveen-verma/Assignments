import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ResultSet rs;
		
		String host = "jdbc:mysql://localhost:3306/";
	   	 String dbName = "storefront";
	   	 String mysqlURL = host + dbName;
	   	 String userId = "root";
	   	 String password = "7462";
	   	JDBCConection jdbc = null;
	   	Statement stmt = null;
	   	 List<Orders> orders=new ArrayList<Orders>();
	   	 List<Categorys> categorys=new ArrayList<>();
	   	Querrys querrys=new Querrys();
	   	 try{
	   		jdbc=new JDBCConection(mysqlURL,userId,password);
	   		stmt=jdbc.getStmt();
	   	 }
	   	catch (Exception cnfe) {
	   		 System.out.println("Error loading driver: " + cnfe);
	   	 }
	   	
	   	 // Assignment 1 
	   	System.out.print("Id--->");
	   	 Scanner sc= new Scanner(System.in);
	   	 String inputId=sc.next();
	   	rs=stmt.executeQuery(querrys.SELECT_ORDERS_START_CONDITION+inputId+querrys.SELECT_ORDERS_REST_CONDITION);
   		while(rs.next()){
   			orders.add(new Orders(rs.getInt(1),rs.getDouble(2),rs.getDate(3)));
   		}
   		System.out.println("---------------------------------------------------------");
   		System.out.println("|\tOrderId\t|\tTotal\t|\tDate\t\t|");
   		System.out.println("---------------------------------------------------------");
	   	for(Orders o:orders){
	   		System.out.println("|\t"+o.getId()+"\t|\t"+o.getTotal()+"\t|\t"+o.getDate()+"\t|");
	   		System.out.println("---------------------------------------------------------");
	   	}
	   	
	   System.out.println("\n\nAssignment 2 \n\n");
	   	//Assignment 2
	   System.out.println("Product Id--->");
	   int productId=sc.nextInt();
	    PreparedStatement psmt = ((java.sql.Connection) jdbc.getCon()).prepareStatement(querrys.INSERT_INTO_PRODUCT_IMG);
        for(int i=1; i<= 5;i++){
              psmt.setBlob(1,new FileInputStream(querrys.IMG_PATH+i+".JPG"));
              psmt.setInt(2,productId);
              psmt.addBatch();
        }
        System.out.println("The number of rows inserted: "+ psmt.executeBatch().length);
        
        //Assignment 3
        System.out.println("The number of rows deleted: "+ stmt.executeUpdate(querrys.DELETE_PRODUCTS_NOT_USED_IN_1_YEAR));
        
        //Assignment 4
        
        rs=stmt.executeQuery(querrys.TOP_CATEGORY_TITILE); 
        while(rs.next()){ 
        	categorys.add(new Categorys(rs.getString(1),rs.getInt(2)));
        }
        System.out.println("Title \t    Child Category");
   		for(Categorys c:categorys){ 
   			System.out.println(c.getTitle()+"\t"+c.getNoOfChildCategorys());
   		}
	}

}
