import java.sql.Date;

public class Orders {
	private int id;
	private double total;
	private Date date;
	public Orders(int id,double total,Date date){
		this.id=id;
		this.total=total;
		this.date=date;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
