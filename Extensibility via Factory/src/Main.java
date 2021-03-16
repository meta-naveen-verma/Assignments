import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		Screen s1 = new Screen();
		Scanner sc = new Scanner(System.in);
		while(true){
			List<Integer> sides = new ArrayList<Integer>();
			System.out.println("1.Add shape\n2.Delete Shape\n3.Delete all shapses by specific type\n4.Sort shapes\n5.Shape enclosing a specified point\n6.Exit");
			int ch=sc.nextInt();
			if(ch==1){
					while(true){
						System.out.println("1.Square\n2.Rectangule\n3.Triangle\n4.Circle\n5.Polygon");
						int x=sc.nextInt();
						if(x==1){
								boolean check=false;
								System.out.print("Width--->");
								int width=sc.nextInt();
								sides.add(width);
								System.out.print("Point(x)--->");
								int xCoordinate=sc.nextInt();
								System.out.print("Point(y)--->");
								int yCoordinate=sc.nextInt();
								check=s1.addShape("square", xCoordinate, yCoordinate, sides);
								if(check){
									System.out.println("Shap Added Successfully ");
									System.out.println("Type--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getShapeType());
									System.out.println("Time Stamp--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getTimeStamp());
									System.out.println("Area--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getArea());
									System.out.println("Origin--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getOrigin());
								}else{
									System.out.println("Failed to add shap");
								}
						}
						else if(x==2){
							boolean check=false;
								System.out.print("Width--->");
								int w=sc.nextInt();
								sides.add(w);
								System.out.print("Length--->");
								int l=sc.nextInt();
								sides.add(l);
								System.out.print("Point(x)--->");
								int xCoordinateR=sc.nextInt();
								System.out.print("Point(y)--->");
								int yCoordinateR=sc.nextInt();
								check=s1.addShape("rectangle", xCoordinateR, yCoordinateR, sides);
								if(check){
									System.out.println("Shap Added Successfully ");
									System.out.println("Type--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getShapeType());
									System.out.println("Time Stamp--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getTimeStamp());
									System.out.println("Area--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getArea());
									System.out.println("Origin--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getOrigin());
								}else{
									System.out.println("Failed to add shap");
								}
						}
						else if(x==3){
							boolean check=false;
								System.out.print("Width--->");
								int wt=sc.nextInt();
								sides.add(wt);
								System.out.print("Length--->");
								int lt=sc.nextInt();
								sides.add(lt);
								System.out.print("Hight--->");
								int ht=sc.nextInt();
								sides.add(ht);
								System.out.print("Point(x)--->");
								int xCoordinateT=sc.nextInt();
								System.out.print("Point(y)--->");
								int yCoordinateT=sc.nextInt();
								check=s1.addShape("triangle", xCoordinateT, yCoordinateT, sides);
								if(check){
									System.out.println("Shap Added Successfully ");
									System.out.println("Type--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getShapeType());
									System.out.println("Time Stamp--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getTimeStamp());
									System.out.println("Area--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getArea());
									System.out.println("Origin--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getOrigin());
								}else{
									System.out.println("Failed to add shap");
								}
						}
						else if(x==4){
							boolean check=false;
								System.out.print("Radius--->");
								int radius=sc.nextInt();
								sides.add(radius);
								System.out.print("Point(x)--->");
								int xCoordinateC=sc.nextInt();
								System.out.print("Point(y)--->");
								int yCoordinateC=sc.nextInt();
								check=s1.addShape("circle", xCoordinateC, yCoordinateC, sides);
								if(check){
									System.out.println("Shap Added Successfully ");
									System.out.println("Type--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getShapeType());
									System.out.println("Time Stamp--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getTimeStamp());
									System.out.println("Area--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getArea());
									System.out.println("Origin--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getOrigin());
								}else{
									System.out.println("Failed to add shap");
								}
						}else if(x==5){
							boolean check=false;
							System.out.print("No of sides--->");
							int noOfSides=sc.nextInt();
							sides.add(noOfSides);
							System.out.print("length of sides--->");
							int lengthOfSides=sc.nextInt();
							sides.add(lengthOfSides);
							System.out.print("Point(x)--->");
							int xCoordinateP=sc.nextInt();
							System.out.print("Point(y)--->");
							int yCoordinateP=sc.nextInt();
							check=s1.addShape("polygon", xCoordinateP, yCoordinateP, sides);
							if(check){
								System.out.println("Shap Added Successfully ");
								System.out.println("Type--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getShapeType());
								System.out.println("Time Stamp--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getTimeStamp());
								System.out.println("Area--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getArea());
								System.out.println("Origin--->"+s1.getListOfShape().get(s1.getListOfShape().size()-1).getOrigin());
							}else{
								System.out.println("Failed to add shap");
							}
						}
						else{
								System.out.println("Enter a Right Option");
								continue;
						}
						break;
					}
			}
			else if(ch==2){
				int count=0;
				for( Shape s : s1.getListOfShape()){
					count++;
					System.out.println(count+"."+s.getShapeType());
				}
				while(true){
					count=sc.nextInt();
					if(count>0 && count<s1.getListOfShape().size()){
						s1.getListOfShape().remove(count-1);
						break;
					}else{
						System.out.println("Select a right option");
						continue;
					}
				}
				
			}
			else if(ch==3){
				boolean check=false;
				System.out.println("Shape--->");
				String str=sc.next();
				check=s1.removeAllShapesOfSameType(str);
				if(!check){
					System.out.println("Failed to delete");
				}
			}else if(ch==4){
				List<Shape> listOfShape = new ArrayList<Shape>();
				while(true){
					System.out.println("1.Area\n2.Perimeter\n3.Timestamp\n4.Origin Distence");
					int x=sc.nextInt();
					if(x==1){
						listOfShape=s1.sortShapeBy("area");
					}else if(x==2){
						listOfShape=s1.sortShapeBy("perimeter");
					}else if(x==3){
						listOfShape=s1.sortShapeBy("timestamp");
					}else if(x==4){
						listOfShape=s1.sortShapeBy("origindistence");
					}else{
						System.out.println("Enter a right option");
						continue;
					}
					for(Shape s: listOfShape){
						System.out.println(s.getShapeType());
					}
					break;
				}
				
			}else if(ch==5){
				List<Shape> listOfShape = new ArrayList<Shape>();
				System.out.print("xCoord--->");
				int xCoord =sc.nextInt();
				System.out.print("yCoord--->");
				int yCoord =sc.nextInt();
				listOfShape=s1.checkShapesEnclosingPoint(xCoord, yCoord);
				for(Shape s: listOfShape){
					System.out.println(s.getShapeType());
				}
			}else if(ch==6){
				break;
			}else{
				System.out.println("Select a right option");
				continue;
			}
			
			
		}
		
		
		/*sides.add(5d);
		s1.addShape("square", 5, 7, sides);
		System.out.println(s1.getListOfShape().get(0).getShapeType());
		System.out.println(s1.getListOfShape().get(0).getTimeStamp());
		System.out.println(s1.getListOfShape().get(0).getArea());
		System.out.println(s1.getListOfShape().get(0).getOrigin());
		System.out.println("----------------");
		sides.add(4d);

		s1.addShape("rectangle", 2d, 7d, sides);
		System.out.println(s1.getListOfShape().get(1).getShapeType());
		System.out.println(s1.getListOfShape().get(1).getTimeStamp());
		System.out.println(s1.getListOfShape().get(1).getArea());
		System.out.println(s1.getListOfShape().get(1).getOrigin());
		System.out.println("----------------");

		sides.add(3d);
		s1.addShape("triangle", 8d, 3d, sides);
		System.out.println(s1.getListOfShape().get(2).getShapeType());
		System.out.println(s1.getListOfShape().get(2).getTimeStamp());
		System.out.println(s1.getListOfShape().get(2).getArea());
		System.out.println(s1.getListOfShape().get(2).getOrigin());
		System.out.println("----------------");

		ArrayList<Double> len = new ArrayList<Double>();
		len.add(4d);
		s1.addShape("circle", 4d, 4d, len);
		System.out.println(s1.getListOfShape().get(3).getShapeType());
		System.out.println(s1.getListOfShape().get(3).getTimeStamp());
		System.out.println(s1.getListOfShape().get(3).getArea());
		System.out.println(s1.getListOfShape().get(3).getOrigin());
		System.out.println("----------------");

		len.remove(0);

		List<Shape> obj = new ArrayList<Shape>();
		obj = s1.checkShapesEnclosingPoint(3d, 6d);
		for(int i=0;i<obj.size();i++){
			System.out.println(obj.get(i).getShapeType());
		}
		System.out.println("----------------");

		obj = s1.sortShapeBy("ärea");
		for(int i=0;i<obj.size();i++){
			System.out.println(obj.get(i).getShapeType());
		}
		System.out.println("----------------");

		System.out.println(s1.removeShape("circle"));*/		

	}

}