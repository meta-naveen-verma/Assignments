import java.util.*;
public class Cart {
	int items=0,totalAmount=0;
	Scanner sc = new Scanner(System.in);
	HashMap<Integer,Product> productIdMap = new HashMap<>();
	HashMap<Integer,Integer> productIdQuantityMap = new HashMap<>();
	Cart(List<Product> availableProducts){
		for(Product p : availableProducts){
			productIdMap.put(p.productId, p);
		}
	}
	void addItemToCart(){
		System.out.print("Enter Product Id -->> ");
		int id = sc.nextInt();
		System.out.print("Enter Quantity -->> ");
		int quantity = sc.nextInt();
		if(quantity <= productIdMap.get(id).quantity){
			if(productIdQuantityMap.containsKey(id)){
				productIdQuantityMap.put(id,productIdQuantityMap.get(id)+quantity);
			}else{
				productIdQuantityMap.put(id,quantity);
			}
			productIdMap.get(id).quantity-=quantity;
			items+=quantity;
			totalAmount+=(quantity*productIdMap.get(id).price);
		}else{
			System.out.println("there is only "+productIdMap.get(id).quantity+" available now so please make a right choese");
		}
	}
	void updateItemInCart(){
		if(productIdQuantityMap.size()>0){
		displayCart();
		System.out.print("Enter Product Id -->> ");
		int id = sc.nextInt();
		System.out.print("Enter Quantity -->> ");
		int quantity = sc.nextInt();
		if(quantity <= productIdQuantityMap.get(id)+productIdMap.get(id).quantity){
			
			if(quantity > productIdQuantityMap.get(id)){
				productIdMap.get(id).quantity-=(quantity-productIdQuantityMap.get(id));
				items+=(quantity-productIdQuantityMap.get(id));
				totalAmount+=((quantity-productIdQuantityMap.get(id))*productIdMap.get(id).price);
			}else{
				productIdMap.get(id).quantity+=(productIdQuantityMap.get(id)-quantity);
				items-=(productIdQuantityMap.get(id)-quantity);
				totalAmount-=((productIdQuantityMap.get(id)-quantity)*productIdMap.get(id).price);
			}
			productIdQuantityMap.put(id,quantity);
		}
		else{
			System.out.println("there is only "+productIdQuantityMap.get(id)+" more available now so please make a right choese");
		}
		}else{
			System.out.println("Empty Cart");
		}
	}
	void removeItemFromCart(){
		if(productIdQuantityMap.size()>0){
		displayCart();
		System.out.print("Enter Product Id -->> ");
		int id = sc.nextInt();
		System.out.print("Enter Quantity -->> ");
		int quantity = sc.nextInt();
		if(quantity < productIdQuantityMap.get(id)){
			productIdQuantityMap.put(id,productIdQuantityMap.get(id)-quantity);
			productIdMap.get(id).quantity+=quantity;
			items-=quantity;
			totalAmount-=(quantity*productIdMap.get(id).price);
		}else if(quantity == productIdQuantityMap.get(id)){
			productIdQuantityMap.remove(id);
			productIdMap.get(id).quantity+=quantity;
			items-=quantity;
			totalAmount-=(quantity*productIdMap.get(id).price);
		}
		else{
			System.out.println("there is only "+productIdQuantityMap.get(id)+" available now so please make a right choese");
		}
		}else{
			System.out.println("Empty Cart");
		}
	}
	void displayCart(){
		System.out.println("ProductId \t Item \t    Quantity \t Price \t Total Amount");
		for(int id :productIdQuantityMap.keySet()){
			System.out.println("   "+id+"  \t         "+productIdMap.get(id).name+"  \t"+productIdQuantityMap.get(id)+"     \t   "+productIdMap.get(id).price+"   \t   "+productIdMap.get(id).price*productIdQuantityMap.get(id));
		}
	}
}
