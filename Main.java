import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	static List<Product> availableProducts = new ArrayList<>();
	
	public static void main(String[] args) {
		addAvailableItemsRandomly();
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart(availableProducts);
		do{
			System.out.println("\n\n\nCart Status --->> "+cart.items+" Items and "+cart.totalAmount+" is payable Amount\n\n");
			displayAvailableItems();
			System.out.println("\n\n1.Add Item In Cart");
			System.out.println("2.Remove Item From Cart");
			System.out.println("3.Update Cart");
			System.out.println("4.Print Bill");
			System.out.println("5.Exit");
			int n = sc.nextInt();
			switch(n) {
				case 1:
						cart.addItemToCart();
						break;
				case 2:
						cart.removeItemFromCart();
						break;
				case 3:
						cart.updateItemInCart();
						break;
				case 4:
						cart.displayCart();
						System.out.println("\nTotal Amount --------->>> "+cart.totalAmount);
				case 5:
						System.exit(0);
			}		
		}while(true);
	}
	
	
	public static void displayAvailableItems() /*throws IOException, InterruptedException*/{
		/*new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  */
		System.out.println("productId\tname\tprice\tquantity");
		for(Product p : availableProducts)
		System.out.println("   "+p.productId+"    \t"+p.name+"\t"+p.price+"\t"+p.quantity);
	}
	
	
	public static void addAvailableItemsRandomly(){
		int max = 10; 
        int min = 1; 
        int range = max - min + 1; 
		for(int i=1;i<=5;i++){
			int price=(int)(Math.random() * range) + min;
			int quantity = (int)(Math.random() * range) + min; 
			Product p = new Product("Item"+i, price, quantity );
			availableProducts.add(p);
		}
	}

}
