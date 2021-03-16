import java.util.Comparator;
public class SortNatural implements Comparator<Employee>{
	public int compare(Employee a, Employee b){
		return a.getId()-b.getId();
	}

}