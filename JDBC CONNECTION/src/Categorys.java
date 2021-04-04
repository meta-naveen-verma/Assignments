
public class Categorys {
	private final String title;
	private final int noOfChildCategorys;
	public Categorys(String title,int noOfChildCategorys){
		this.title=title;
		this.noOfChildCategorys=noOfChildCategorys;
	}
	public int getNoOfChildCategorys() {
		return noOfChildCategorys;
	}
	public String getTitle() {
		return title;
	}
}
