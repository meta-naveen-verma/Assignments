
public class Querrys {
	public final String IMG_PATH="C:\\Users\\naveen.verma_metacub\\workspace\\JDBC CONNECTION\\logo";
	
	public final String SELECT_ORDERS_START_CONDITION="select t1.OID, t1.OrderTotal,t1.Date from Orders t1 INNER JOIN ShoppersOrder t2 ON t1.OID=t2.OID and t2.Status='Shipped' and SID=";
	public final String SELECT_ORDERS_REST_CONDITION=" group by t1.OID order by Date";
	public final String INSERT_INTO_PRODUCT_IMG="insert into ProductImages (Images,PID) values (?,?)";
	public final String DELETE_PRODUCTS_NOT_USED_IN_1_YEAR="Delete from Products where PID NOT IN(select PID from ShoppersOrder where DATEDIFF(curdate(),date)<=365)";
	public final String TOP_CATEGORY_TITILE="select t1.Title,count(t2.Title) from Categories t1 INNER JOIN Categories t2 ON t1.Title=t2.ParentCategory where t1.ParentCategory='Top Category' group by (t2.ParentCategory);";
}
