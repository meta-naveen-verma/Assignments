import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


public class Polygon implements Shape{
	private String type = typeOfShape.POLYGON.toString();
	private double length;
	private double noOfSides;
	private StartingPoint coordinates;
	private double area, perimeter,originDistance;
	private Timestamp tstamp;

	/**
	 * Constructor to
	 * Create a square
	 * 
	 * @param obj
	 * @param length
	 */
	public Polygon(StartingPoint obj, List<Integer> list){
		this.length = list.get(0);
		noOfSides=list.get(1);
		coordinates = new StartingPoint(obj.xCoordinate, obj.yCoordinate);
		area = (length*length*noOfSides)/(4*Math.tan(Math.toRadians(3.14/noOfSides)));
		perimeter = noOfSides*length;
		originDistance = Math.sqrt(Math.pow(coordinates.xCoordinate, 2) 
				+ Math.pow(coordinates.yCoordinate, 2));
		Date date= new Date();
		long time = date.getTime();
		tstamp = new Timestamp(time);
	}

	/**
	 * @return area of square
	 */
	@Override
	public double getArea() {
		return area;
	}

	/**
	 * @return origin of square
	 */
	@Override
	public double getOrigin() {
		return originDistance;
	}

	/**
	 * @return perimeter of square
	 */
	@Override
	public double getPerimeter() {
		return perimeter;
	}

	/**
	 * @return square is bounded or not
	 */
	@Override
	public boolean isPointEnclosed(StartingPoint obj){
		if(obj.xCoordinate >= coordinates.xCoordinate 
				&& obj.xCoordinate <= coordinates.xCoordinate+length
				&& obj.yCoordinate >= coordinates.yCoordinate 
				&& obj.yCoordinate <= coordinates.yCoordinate+length){
			return true;
		}
		return false;
	}

	@Override
	public String getShapeType() {
		return type;
	}

	@Override
	public Timestamp getTimeStamp() {
		return tstamp;
	}
}
