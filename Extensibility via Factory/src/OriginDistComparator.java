import java.util.Comparator;

public class OriginDistComparator implements Comparator<Shape> {

	@Override
	public int compare(Shape s1,Shape s2){  
		if(s1.getOrigin()==s2.getOrigin())  
			return 0;  
		else if(s1.getOrigin()>s2.getOrigin())  
			return 1;  
		else
			return -1;  
	}
}