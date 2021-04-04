import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.FileInputStream;

public class JDBCConection {
	private String mysqlURL;
	private String userId;
	private String password;
	private Connection con;
	private Statement stmt;
	
	public JDBCConection(String mysqlURL,String userId,String password) throws Exception{
		this.mysqlURL=mysqlURL;
		this.userId=userId;
		this.password=password;
		createConection();
	}
	public void createConection() throws Exception{
 		  Class.forName("com.mysql.cj.jdbc.Driver");  
 		  con= (Connection) DriverManager.getConnection(mysqlURL,userId,password); 
 		  setStmt(((java.sql.Connection) con).createStatement());  
	}
	public Statement getStmt() {
		return stmt;
	}
	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}
	public Connection getCon() {
		return con;
	}	  
}
