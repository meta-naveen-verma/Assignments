import java.util.List;
public class ShapeFactory {
	public static Shape typeShapeFactory(String shapeType, StartingPoint coordinate, List<Integer> length){
		Shape obj = null;
		if(Shape.typeOfShape.SQUARE.toString().equalsIgnoreCase(shapeType))
			obj = new Square(coordinate, length);
		else if(Shape.typeOfShape.RECTANGLE.toString().equalsIgnoreCase(shapeType))
			obj = new Rectangle(coordinate,length);
		else if(Shape.typeOfShape.TRIANGLE.toString().equalsIgnoreCase(shapeType))
			obj = new Triangle(coordinate,length);
		else if(Shape.typeOfShape.CIRCLE.toString().equalsIgnoreCase(shapeType))
			obj = new Circle(coordinate,length);
		else if(Shape.typeOfShape.POLYGON.toString().equalsIgnoreCase(shapeType))
			obj = new Polygon(coordinate, length);
		return obj;
	}
}