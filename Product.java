
public class Product {
	String name;
	int productId;
	int price;
	int quantity;
	static int objCount=0;
	Product(){
	}
	
	Product(String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		objCount++;
		productId=objCount;
		
	}
}
