import java.util.Scanner;
public class Main {
	static ZooManagement zoo = new ZooManagement();
	public static void addZone(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Eneter the capacity of cages ---> ");
		int capacityOfCages=sc.nextInt();
		String type="";
		while(true){
			System.out.print("Select type of zone\n1.Mammal\n2.Reptile\n3.Bird\n--->");
			int n=sc.nextInt();
			if(n==1)
				type="mammal";
			else if(n==2)
				type="reptile";
			else if(n==3)
				type="bird";
			else{
				System.out.println("Select a right option");
				continue;
			}
			break;
		}
		boolean park = false;
		while(true){
			System.out.print("Park is\n1.Available\n2.No Available\n--->");
			int n=sc.nextInt();
			if(n==1)
				park=true;
			else if(n==2)
				park=false;
			else{
				System.out.println("Select a right option");
				continue;
			}
			break;
		}
		boolean canteen = false;
		while(true){
			System.out.print("Canteen is\n1.Available\n2.No Available\n--->");
			int n=sc.nextInt();
			if(n==1)
				canteen=true;
			else if(n==2)
				canteen=false;
			else{
				System.out.println("Select a right option");
				continue;
			}
			break;
		}
		boolean check = zoo.addZone(capacityOfCages, type,park,canteen);
		if(check)
			System.out.println("Zone created successfully");
		else
			System.out.println("Failed to create Zone");
	}
	//------------------------------------------------
	public static void addCage(){
		Scanner sc=new Scanner(System.in);
		String type="";
		String animalBreed="";
		while(true){
			System.out.print("Select type of zone\n1.Mammal\n2.Reptile\n3.Bird\n--->");
			int n=sc.nextInt();
			if(n==1){
				type="mammal";
				while(true){
					System.out.println("Select a mammal\n1.Tiger");
					int n1=sc.nextInt();
					if(n1==1){
						animalBreed="tiger";
						break;
					}else{
						System.out.println("Please select a right option");
						continue;
					}
				}
			}
			else if(n==2){
				type="reptile";
				while(true){
					System.out.println("Select a reptile\n1.Crocodile");
					int n1=sc.nextInt();
					if(n1==1){
						animalBreed="crocodile";
						break;
					}else{
						System.out.println("Please select a right option");
						continue;
					}
				}
			}	
			else if(n==3){
				type="bird";
				while(true){
					System.out.println("Select a bird\n1.Eagle");
					int n1=sc.nextInt();
					if(n1==1){
						animalBreed="eagle";
						break;
					}else{
						System.out.println("Please select a right option");
						continue;
					}
				}
			}
			else{
				System.out.println("Select a right option");
				continue;
			}
			break;
		}
		System.out.print("Eneter the capacity ---> ");
		int capacity=sc.nextInt();
		boolean check = zoo.addCage(type,animalBreed,capacity);
		if(check)
			System.out.println("Cage created successfully");
		else
			System.out.println("Failed to create Cage");
	}
	//----------------------------------------------------------------
	
	public static void addAnimal(){
		Scanner sc= new Scanner(System.in);
		String type="";
		/*while(true){
			System.out.print("Select type of zone\n1.Tiger\n2.Crocodile\n3.Eagle\n--->");
			int n=sc.nextInt();
			if(n==1)
				type="tiger";
			else if(n==2)
				type="crocodile";
			else if(n==3)
				type="eagle";
			else{
				System.out.println("Select a right option");
				continue;
			}
			break;
		}*/
		
		System.out.print("Name--->");
		String name=sc.nextLine();
		String category;
		System.out.print("Sound--->");
		String sound=sc.nextLine();
		System.out.print("Wight--->");
		float weight=sc.nextFloat();
		System.out.print("Age---> ");
		int age=sc.nextInt();
		boolean check=false;
		while(true){
			System.out.print("Select type of zone\n1.Mammal\n2.Reptile\n3.Bird\n--->");
			int n=sc.nextInt();
			if(n==1){
				category="mammal";
				while(true){
					System.out.println("1.Tiger");
					System.out.print("---> ");
					int x=sc.nextInt();
					if(x==1){
						type="tiger";
						break;
					}else{
						continue;
					}
				}
				System.out.print("Speed--->");
				int speed=sc.nextInt();
				check=zoo.addAnimal(type, age, name, category, weight, speed, sound);
			}
			else if(n==2){
				category="reptile";
				while(true){
					System.out.println("1.Crocodile");
					System.out.print("---> ");
					int x=sc.nextInt();
					if(x==1){
						type="crocodile";
						break;
					}else{
						continue;
					}
				}
				System.out.print("Swim--->");
				String swim=sc.nextLine();
				check=zoo.addAnimal(type, age, name, category, weight, swim, sound);
			}
			else if(n==3){
				category="bird";
				while(true){
					System.out.println("1.Crocodile");
					System.out.print("---> ");
					int x=sc.nextInt();
					if(x==1){
						type="crocodile";
						break;
					}else{
						continue;
					}
				}
				System.out.print("Can Fly--->");
				boolean canFly=sc.nextBoolean();
				check=zoo.addAnimal(type, age, name, category, weight, canFly, sound);
			}
			else{
				System.out.println("Select a right option");
				continue;
			}
			break;
		}
		if(check){
			System.out.println("Animal added successfully");
		}
		else{
			System.out.println("Failed to add Animal");
		}
		
	}
	
	public static void removeAnimal(){
		Scanner sc=new Scanner(System.in);
		String category="";
		String breed="";
		String name="";
		boolean check=false;
		while(true){
			System.out.print("Select type of zone\n1.Mammal\n2.Reptile\n3.Bird\n--->");
			int n=sc.nextInt();
			if(n==1){
				category="mammal";
				while(true){
					System.out.println("1.Tiger");
					System.out.print("---> ");
					int x=sc.nextInt();
					if(x==1){
						breed="tiger";
						break;
					}else{
						continue;
					}
				}
			}
				
			else if(n==2){
				category="reptile";
				while(true){
					System.out.println("1.Crocodile");
					System.out.print("---> ");
					int x=sc.nextInt();
					if(x==1){
						breed="crocodile";
						break;
					}else{
						continue;
					}
				}
			}
			else if(n==3){
				category="bird";
				while(true){
					System.out.println("1.Crocodile");
					System.out.print("---> ");
					int x=sc.nextInt();
					if(x==1){
						breed="crocodile";
						break;
					}else{
						continue;
					}
				}
				
			}
			else{
				System.out.println("Select a right option");
				continue;
			}
			sc.nextLine();
			System.out.print("Name--->");
			name=sc.nextLine();
			check=zoo.removeAnimal(category, breed, name);
			if(check){
				System.out.println("Animal removed Succesfully");
			}
			else{
				System.out.println("Failed to delete Animal");
			}
			break;
		}
	}
	
	public static void main(String[] args){
		int ch=6;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.print("1.Add Zone\n2.Add Case\n3.Add Animal\n4.Remove Animal\n5.Exit");
			ch=sc.nextInt();
			switch(ch){
				case 1:
					addZone();
					break;
				case 2:
					addCage();
					break;
				case 3:
					addAnimal();
					break;
				case 4:
					removeAnimal();
					break;
				default:
					System.out.println("Select a right option");
			}
		}while(ch!=6);
	} 
}
